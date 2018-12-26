package com.benliu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benliu.entity.RegulatorData;
import com.benliu.mapper.RegulatorMapper;
import com.benliu.service.RegulatorDataService;
import com.benliu.utils.FormatUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 
 * @author LinYunZhi
 * @since 2018年12月25日
 */
@Service
public class RegulatorDataServiceImpl implements RegulatorDataService {

	@Autowired
	private RegulatorMapper regulatorMapper;
	
	@Override
	public JSONObject selectRegulatorData(JSONObject request_body, int queryType, int queryData) {
		
        Map<String, String> queryMap = FormatUtil.JSONtoHashMap(request_body);
        List<RegulatorData> RDList;
        if (queryType == 1)
            RDList = regulatorMapper.getRDList(queryMap);
        else
            RDList = regulatorMapper.getLataTenRD(queryMap);

        JSONArray RDAra = new JSONArray();
        for (RegulatorData regulatorData : RDList) {
            JSONObject RDObj = regulatorData.getRDJSON(queryData);
            RDAra.add(RDObj);
        }

        JSONObject res = new JSONObject();
        res.put("regulatorData", RDAra);
		return res;
	}

}
