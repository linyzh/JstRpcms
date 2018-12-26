package com.benliu.service;

import net.sf.json.JSONObject;

/**
 * 
 * @author LinYunZhi
 * @since 2018年12月25日
 */
public interface RegulatorDataService {

	/**
	 * 调压器数据
	 * @param request_body
	 * @param queryType	获取方式[1:按日期获取, 2:获取最后十条]
	 * @param queryData	查询的数据[1为电压，2为电流，3为无功功率，4为有功功率，5为功率因数]
	 * @return
	 */
	JSONObject selectRegulatorData(JSONObject request_body, int queryType, int queryData);

}
