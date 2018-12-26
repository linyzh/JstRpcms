package com.benliu.vo;

import lombok.Data;

@Data
public class AnalysisParamVo {

	/**
	 * 通信机ID
	 */
	private Integer machineId;
	
	/**
	 * 起始时间
	 */
	private String dateBegin;
	
	/**
	 * 结束时间
	 */
	private String dateEnd;
	
	/**
	 * 数据类型
	 */
	private Integer dataType;
	
}
