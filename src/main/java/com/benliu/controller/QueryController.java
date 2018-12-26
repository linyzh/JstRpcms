package com.benliu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.benliu.service.RealDataService;
import com.benliu.service.RegulatorDataService;
import com.benliu.service.SwitchingRecdService;
import com.benliu.service.WarningInfoService;
import com.benliu.utils.RequestUtil;
import com.benliu.utils.ResponseUtil;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;

/**
 * Created by kunlun on 2016/10/18.
 */
@Slf4j
@Controller
public class QueryController {
	
	@Autowired
	private WarningInfoService warningInfoService;
	
	@Autowired
	private SwitchingRecdService switchingRecdService;

    @Autowired
    private RealDataService realDataService;
    
    @Autowired
    private RegulatorDataService regulatorDataService;

    /**
     * 数据查询
     * @param request
     * @param response
     */
    @RequestMapping(value = "/dataQuery", method = RequestMethod.POST)
    public void queryData(HttpServletRequest request, HttpServletResponse response) {

        JSONObject request_body = RequestUtil.getJSONObject(request);
        if(log.isDebugEnabled()) {
        	log.debug("请求参数: "+request_body.toString());
        }
        int queryType = request_body.getInt("queryType");  // 获取方式，1为“按日期获取”，2为“获取最后十条”
        int dataType = request_body.getInt("dataType");	// 为数据类型，1为告警类型，2为投切记录，3为实时数据，4为调压器数据
        int queryData = request_body.getInt("queryData");	// 查询的数据，1为电压，2为电流，3为无功功率，4为有功功率，5为功率因数
        
        JSONObject result = null;
        switch (dataType) {
            case 1: // 告警类型
            	result = warningInfoService.queryWarningInfo(request_body, queryType);
            	break;
            case 2: // 投切数据
            	result = switchingRecdService.selectSwitchingRecd(request_body, queryType, queryData);
                break;
            case 3: // 实时数据
            	result = realDataService.selectRealData(request_body, queryType, queryData);
                break;
            case 4: // 调压器数据
            	result = regulatorDataService.selectRegulatorData(request_body, queryType, queryData);
                break;
            default:
            	if(log.isDebugEnabled()) {
            		log.debug("数据类型参数错误! --"+dataType);
            	}
            	break;
        }
        
        ResponseUtil.responseJSON(response, result);
    }

}