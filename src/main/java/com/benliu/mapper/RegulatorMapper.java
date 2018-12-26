package com.benliu.mapper;

import java.util.List;
import java.util.Map;

import com.benliu.entity.RegulatorData;

/**
 * Created by kunlun on 2016/11/9.
 */
public interface RegulatorMapper {

    List<RegulatorData> getRDList(Map<String, String> queryMap);

    List<RegulatorData> getLataTenRD(Map<String, String> queryMap);
}
