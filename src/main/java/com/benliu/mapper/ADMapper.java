package com.benliu.mapper;

import java.util.List;

import com.benliu.entity.AnalysisData;

/**
 * Created by kunlun on 2016/10/30.
 * Add method description: LinYunZhi on 2018-12-25
 */
public interface ADMapper {

    List<AnalysisData> getVoltage_RD_M(int machineId, String dateBegin, String dateEnd, int minutes);

    List<AnalysisData> getCurrent_RD_M(int machineId, String dateBegin, String dateEnd, int minutes);

    List<AnalysisData> getPowerFactor_RD_M(int machineId, String dateBegin, String dateEnd, int minutes);

    List<AnalysisData> getReactivePower_RD_M(int machineId, String dateBegin, String dateEnd, int minutes);

    List<AnalysisData> getActivePower_RD_M(int machineId, String dateBegin, String dateEnd, int minutes);
    /**
     * 通信机指定日期范围的输入输出电压
     * @param machineId
     * @param dateBegin
     * @param dateEnd
     * @return
     */
    List<AnalysisData> getVoltage_RD(int machineId, String dateBegin, String dateEnd);

    /**
     * 通信机指定日期范围的输入输出电流
     * @param machineId
     * @param dateBegin
     * @param dateEnd
     * @return
     */
    List<AnalysisData> getCurrent_RD(int machineId, String dateBegin, String dateEnd);

    /**
     * 通信机指定日期范围的功率因数(三相数据)
     * @param machineId
     * @param dateBegin
     * @param dateEnd
     * @return
     */
    List<AnalysisData> getPowerFactor_RD(int machineId, String dateBegin, String dateEnd);

    /**
     * 通信机指定日期范围的有功功率(三相数据)
     * @param machineId
     * @param dateBegin
     * @param dateEnd
     * @return
     */
    List<AnalysisData> getActivePower_RD(int machineId, String dateBegin, String dateEnd);

    /**
     * 通信机指定日期范围的无功功率(三相数据)
     * @param machineId
     * @param dateBegin
     * @param dateEnd
     * @return
     */
    List<AnalysisData> getReactivePower_RD(int machineId, String dateBegin, String dateEnd);

}
