package com.benliu.mapper;

import java.util.List;
import java.util.Map;

import com.benliu.entity.RealData;

/**
 * Created by kunlun on 2016/10/18.
 */
public interface RDMapper {

    List<RealData> getRDList(Map<String, String> queryMap);

    List<RealData> getLastTenRD(Map<String, String> queryMap);

    List<RealData> getRDListHis(Map<String, String> queryMap);

    List<RealData> getLastTenRDHis(Map<String, String> queryMap);

}
