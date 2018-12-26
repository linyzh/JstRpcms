package com.benliu.service;

import com.benliu.entity.AnalysisData;

import java.util.List;

/**
 * 
 * @author LinYunZhi
 * @since 2018年12月24日
 */
public interface AnalysisDataService {

	/**
	 * 
	 * @param machineId
	 * @param dateBegin
	 * @param dateEnd
	 * @param dataType
	 * @return
	 */
    public List<AnalysisData> findAnalysisData(int machineId, String dateBegin, String dateEnd, int dataType);
    /**
     * 
     * @param machineId
     * @param dateBegin
     * @param dateEnd
     * @param dataType
     * @param minutes
     * @return
     */
    public List<AnalysisData> findAnalysisData(int machineId, String dateBegin, String dateEnd, int dataType, int minutes);

}
