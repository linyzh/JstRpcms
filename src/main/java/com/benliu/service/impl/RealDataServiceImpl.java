package com.benliu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benliu.entity.RealData;
import com.benliu.mapper.RDMapper;
import com.benliu.service.RealDataService;
import com.benliu.utils.FormatUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 
 * @author LinYunZhi
 * @since 2018年12月25日
 */
@Service
public class RealDataServiceImpl implements RealDataService {

	@Autowired
	private RDMapper rdMapper;
	
	@Override
	public JSONObject selectRealData(JSONObject request_body, int queryType, int queryData) {
        Map<String, String> queryMap = FormatUtil.JSONtoHashMap(request_body);
        List<RealData> RDList = null;

        if (queryType == 1) {
            if (queryData < 50 && queryData != 1) {
                RDList = rdMapper.getRDListHis(queryMap);

            } else {
                RDList = rdMapper.getRDList(queryMap);

            }
        } else {
            if (queryData < 50 && queryData != 1) {
                RDList = rdMapper.getLastTenRDHis(queryMap);
            } else {
                RDList = rdMapper.getLastTenRD(queryMap);

            }
        }

        JSONArray RDAra = new JSONArray();
        for (RealData realData : RDList) {
            JSONObject RDObj = realData.RDtoJSON(queryData);
            RDAra.add(RDObj);
        }

        JSONObject res = new JSONObject();
        res.put("realData", RDAra);
		return res;
	}

}
