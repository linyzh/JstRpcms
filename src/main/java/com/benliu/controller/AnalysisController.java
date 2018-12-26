package com.benliu.controller;

import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.benliu.entity.AnalysisData;
import com.benliu.service.AnalysisDataService;
import com.benliu.utils.DateUtil;
import com.benliu.utils.ResponseUtil;
import com.benliu.vo.AnalysisParamVo;

import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


/**
 * Created by kunlun on 2016/10/30.
 * 整理代码：LinYunZHi 2018-12-25
 */
@Slf4j
@Controller
public class AnalysisController {

    @Autowired
    private AnalysisDataService analysisDataService;

    /**
     * 运行工况模块中的曲线 和曲线分析数据接口
     * @param response
     * @param param
     */
    @RequestMapping(value = "/analysis", method = RequestMethod.POST)
    public void requestFilter(HttpServletResponse response, @RequestBody AnalysisParamVo param) {
        if(log.isDebugEnabled()) {
        	log.debug("Rrequest parameter: "+param.toString());
        }
        int dataType = param.getDataType();
        int machineId = param.getMachineId();
        String dateBeginStr = param.getDateBegin();
        String dateEndStr = param.getDateEnd();
        
        String dateBegin = DateUtil.startDate(dateBeginStr);
        String dateEnd = DateUtil.endDate(dateEndStr);

        List<AnalysisData> dataList = null;
        if (dateBeginStr.equals(dateEndStr)) {
        	dataList = analysisDataService.findAnalysisData(machineId, dateBegin, dateEnd, dataType);
        } else {
            Calendar calendarA = Calendar.getInstance();
            calendarA.setTime(DateUtil.getSimpleDate(dateBeginStr));
            Calendar calendarB = Calendar.getInstance();
            calendarB.setTime(DateUtil.getSimpleDate(dateEndStr));

            int days = calendarB.get(Calendar.DAY_OF_YEAR) - calendarA.get(Calendar.DAY_OF_YEAR);
            // TODO 不明白这为什么日期期间差+1后乘以10
            int minutes = (days + 1) * 10;

            dataList = analysisDataService.findAnalysisData(machineId, dateBegin, dateEnd, dataType, minutes);
        }
        
        JSONArray dataAra = new JSONArray();
        if(null != dataList && dataList.size() > 0) {
	        if(1==dataType || 2==dataType || 3==dataType) {
	        	dataList.forEach(analysisData -> dataAra.add(analysisData.getPowerData()));
        	}else if(4==dataType || 5==dataType) {
        		dataList.forEach(analysisData -> dataAra.add(analysisData.getDoubleData()));
        	}
        }

        JSONObject res = new JSONObject();
        res.put("analysisData", dataAra);
        log.info("Return data size: "+dataAra.size());
        ResponseUtil.responseJSON(response, res);
    }


    /**
     * 	获取过去24小时设备的输入输出电流和输入输出电压，包括三相输入和三相输出电压
     * @param request
     * @param response
     * @see
     */
    @Deprecated
    @RequestMapping(value = "/analysis/past24", method = RequestMethod.POST)
    public void getPast24HData(HttpServletRequest request, HttpServletResponse response,@RequestBody AnalysisParamVo param) {

		/*
		 * JSONObject request_body = RequestUtil.getJSONObject(request);
		 * if(log.isDebugEnabled()) {
		 * log.debug("Rrequest parameter: "+request_body.toString()); } int machineId =
		 * param.getMachineId(); String currentTime = request_body.getString("time");
		 * Date date = DateUtil.getFullDate(currentTime);
		 * 
		 * 
		 * Date past24h = DateUtil.recent(date, 24); String pastStr =
		 * DateUtil.getDateStr(past24h);
		 */

		
		/*
		 * 应该设计成一个service接口，只查一次数据库，而不是分开两次
		 * List<AnalysisData> voltageList = adMapper.getVoltage_RD(machineId, pastStr,
		 * currentTime); List<AnalysisData> currentList =
		 * adMapper.getCurrent_RD(machineId, pastStr, currentTime);
		 * 
		 * JSONArray voltageAra = new JSONArray(); if(null != voltageList &&
		 * voltageList.size() > 0) { voltageList.parallelStream().forEach(voltageData ->
		 * voltageAra.add(voltageData.getDoubleData())); } JSONArray currentAra = new
		 * JSONArray(); if(null != currentList && currentList.size() > 0) {
		 * currentList.parallelStream().forEach(currentData ->
		 * currentAra.add(currentData.getDoubleData())); }
		 * 
		 * JSONObject ret = new JSONObject(); ret.put("voltage", voltageAra);
		 * ret.put("current", currentAra);
		 * log.info("Return voltage ara data size: "+voltageAra.size());
		 * log.info("Return current ara data size: "+currentAra.size());
		 * ResponseUtil.responseJSON(response, ret);
		 */
		 

    }

}
