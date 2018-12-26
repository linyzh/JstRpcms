package com.benliu.service.impl;

import com.benliu.constants.AnalysisDataType;
import com.benliu.entity.AnalysisData;
import com.benliu.mapper.ADMapper;
import com.benliu.service.AnalysisDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalysisDataServiceImpl implements AnalysisDataService {

	@Autowired
	private ADMapper adMapper;
	 
	@Override
	public List<AnalysisData> findAnalysisData(int machineId, String dateBegin, String dateEnd, int dataType) {
		List<AnalysisData> dataList = null;
		switch (dataType) {
	        case AnalysisDataType.PF:
	            dataList = adMapper.getPowerFactor_RD(machineId, dateBegin, dateEnd);
	            break;
	        case AnalysisDataType.AP:
	            dataList = adMapper.getActivePower_RD(machineId, dateBegin, dateEnd);
	            break;
	        case AnalysisDataType.RP:
	            dataList = adMapper.getReactivePower_RD(machineId, dateBegin, dateEnd);
	            break;
	        case AnalysisDataType.U:
	            dataList = adMapper.getVoltage_RD(machineId, dateBegin, dateEnd);
	            break;
	        case AnalysisDataType.I:
	            dataList = adMapper.getCurrent_RD(machineId, dateBegin, dateEnd);
	            break;
	        default:
	            break;
	    }
		return dataList;
	}

	@Override
	public List<AnalysisData> findAnalysisData(int machineId, String dateBegin, String dateEnd, int dataType,
			int minutes) {
		List<AnalysisData> dataList = null;
		switch (dataType) {
	        case AnalysisDataType.PF:
	            dataList = adMapper.getPowerFactor_RD_M(machineId, dateBegin, dateEnd, minutes);
	            break;
	        case AnalysisDataType.AP:
	            dataList = adMapper.getActivePower_RD_M(machineId, dateBegin, dateEnd, minutes);
	            break;
	        case AnalysisDataType.RP:
	            dataList = adMapper.getReactivePower_RD_M(machineId, dateBegin, dateEnd, minutes);
	            break;
	        case AnalysisDataType.U:
	            dataList = adMapper.getVoltage_RD_M(machineId, dateBegin, dateEnd, minutes);
	            break;
	        case AnalysisDataType.I:
	            dataList = adMapper.getCurrent_RD_M(machineId, dateBegin, dateEnd, minutes);
	            break;
	        default:
	            break;
	    }
		return dataList;
	}

    
}
