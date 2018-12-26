package com.benliu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benliu.entity.SwitchingRecd;
import com.benliu.mapper.SRMapper;
import com.benliu.service.SwitchingRecdService;
import com.benliu.utils.FormatUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 
 * @author LinYunZhi
 * @since 2018年12月25日
 */
@Service
public class SwitchingRecdServiceImpl implements SwitchingRecdService {

	@Autowired
    private SRMapper srMapper;
	
	@Override
	public JSONObject selectSwitchingRecd(JSONObject queryJson, int queryType, int queryData) {
        Map<String, String> queryMap = FormatUtil.JSONtoHashMap(queryJson);
        List<SwitchingRecd> SRList = null;
        if (queryType == 1)
            SRList = srMapper.getSRList(queryMap);
        else
            SRList = srMapper.getLastTenSR(queryMap);

        List<String> switchingReasons = srMapper.getSwitchingReasons();
        List<String> switchingActions = srMapper.getSwitchingActions();

        JSONArray SRAra = new JSONArray();
        for (SwitchingRecd switchingRecd : SRList) {
            JSONObject SRObj = switchingRecd.SRtoJSON(queryData);
            SRObj.put("switchingTime", switchingRecd.getSwitchingTime());
            SRObj.put("capacitorId", switchingRecd.getCapacitorId());
            SRObj.put("capacitorSecondId", switchingRecd.getCapacitorSecondId());
            SRObj.put("switchingAction", switchingActions.get(switchingRecd.getSwitchingActionId()).substring(0, 1));
            SRObj.put("switchingReason", switchingReasons.get(switchingRecd.getSwitchingReasonId()));

            SRAra.add(SRObj);
        }

        JSONObject res = new JSONObject();
        res.put("switchingRecd", SRAra);

        return res;
    }
	
}
