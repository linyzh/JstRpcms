package com.benliu.mapper;

import java.util.List;
import java.util.Map;

import com.benliu.entity.SwitchingRecd;

/**
 * Created by kunlun on 2016/10/18.
 */
public interface SRMapper {

    List<SwitchingRecd> getSRList(Map<String, String> queryMap);

    List<SwitchingRecd> getLastTenSR(Map<String, String> queryMap);

    List<String> getSwitchingReasons();

    List<String> getSwitchingActions();
}
