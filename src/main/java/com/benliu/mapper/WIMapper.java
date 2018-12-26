package com.benliu.mapper;

import java.util.List;
import java.util.Map;

import com.benliu.entity.WarningInfo;

/**
 * Created by kunlun on 2016/10/18.
 */
public interface WIMapper {

    List<WarningInfo> getWIList(Map<String, String> queryMap);

    List<WarningInfo> getLastTenWI(Map<String, String> queryMap);

}
