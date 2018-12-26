package com.benliu.service;

import net.sf.json.JSONObject;

/**
 * 
 * @author LinYunZhi
 * @since 2018年12月25日
 */
public interface WarningInfoService {

	/**
	 * 查询告警信息
	 * @param queryJson
	 * @param type
	 * @return
	 */
	public JSONObject queryWarningInfo(JSONObject queryJson, int type);
	
}
