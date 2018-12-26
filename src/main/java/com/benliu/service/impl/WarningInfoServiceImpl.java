package com.benliu.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.benliu.entity.WarningInfo;
import com.benliu.mapper.WIMapper;
import com.benliu.service.WarningInfoService;
import com.benliu.utils.FormatUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 
 * @author LinYunZhi
 * @since 2018年12月25日
 */
@Service
public class WarningInfoServiceImpl implements WarningInfoService {

	@Autowired
	private WIMapper wiMapper;

	@Override
	public JSONObject queryWarningInfo(JSONObject queryJson, int type) {
		Map<String, String> queryMap = FormatUtil.JSONtoHashMap(queryJson);

		// capacitorSecondId如果是“”，是指查询所有，如果是“NULL”，是指查询子ID为空的记录
		List<WarningInfo> WIlist;
		if (type == 1)
			WIlist = wiMapper.getWIList(queryMap);
		else
			WIlist = wiMapper.getLastTenWI(queryMap);

		JSONArray WIAra = new JSONArray();
		for (WarningInfo warningInfo : WIlist) {
			JSONObject WIObj = new JSONObject();
			WIObj.put("warnTime", warningInfo.getWarnTime());
			WIObj.put("capacitorId", warningInfo.getCapacitorId());
			String capacitorSecondId = warningInfo.getCapacitorSecondId();
			WIObj.put("capacitorSecondId", capacitorSecondId == null ? "NULL" : capacitorSecondId);
			WIObj.put("warnType", warningInfo.getWarnType());
			WIObj.put("exception", warningInfo.getException());
			WIObj.put("warnData", wrappingWarnDataById(warningInfo.getWarnType(), warningInfo).toString());

			WIAra.add(WIObj);
		}

		JSONObject res = new JSONObject();
		res.put("warnInfo", WIAra);

		return res;
	}

	/**
	 * 封装告警数据信息
	 * 
	 * @param warnType
	 * @param warningInfo
	 * @return
	 */
	private StringBuilder wrappingWarnDataById(String warnType, WarningInfo warningInfo) {
		StringBuilder warnData = new StringBuilder();
		switch (warnType) {
		case "过压告警":
		case "缺相告警":
		case "欠压告警":
			warnData.append("电压：A").append(warningInfo.getVoltage_A()).append("  B").append(warningInfo.getVoltage_B())
					.append("  C").append(warningInfo.getVoltage_C());
			break;
		case "过流告警":
		case "欠流告警":
			warnData.append("电流：A").append(warningInfo.getCurrent_A()).append("  B").append(warningInfo.getCurrent_B())
					.append("  C").append(warningInfo.getCurrent_C());
			break;
		case "电压谐波保护":
			warnData.append("电压谐波保护：A").append(warningInfo.getvHarmonic_A()).append("  B")
					.append(warningInfo.getvHarmonic_B()).append("  C").append(warningInfo.getvHarmonic_C());
			break;
		case "电流谐波保护":
			warnData.append("电流谐波保护：A").append(warningInfo.getcHarmonic_A()).append("  B")
					.append(warningInfo.getcHarmonic_B()).append("  C").append(warningInfo.getcHarmonic_C());
			break;
		case "温度保护告警":
			warnData.append("温度：").append(warningInfo.getTemperature());
			break;
		case "电容器故障":
		case "控制晶闸管故障":
		case "温度传感器故障":
			warnData.append("故障次数：").append(warningInfo.getBrokenTime());
			break;
		default:
			warnData.append("未知告警数据");
			break;
		}
		return warnData;
	}
}
