package com.benliu.enums;

import com.benliu.constants.AnalysisDataType;

/**
 * 分析数据类型枚举常量
 * @author LinYunZhi
 * @since 2018年12月25日
 */
public enum AnalysisDataTypeEnum {
	
	PF(AnalysisDataType.PF, "功率因素"), AP(2, "有功功率"), RP(3, "无功功率"), U(4, "电压"), I(5, "电流");
	
	private Integer typeId;
	
	private String typeName;

	public Integer getTypeId() {
		return typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	private AnalysisDataTypeEnum(int typeId, String typeName) {
		this.typeId = typeId;
		this.typeName = typeName;
	}
	
	public String getTypeName(Integer typeId) {
		if(null != typeId) {
			for(AnalysisDataTypeEnum type : AnalysisDataTypeEnum.values()) {
				if(typeId.equals(type.getTypeId())) {
					return type.getTypeName();
				}
			}
		}
		return null;
	}
}
