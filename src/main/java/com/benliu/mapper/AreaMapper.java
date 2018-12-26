package com.benliu.mapper;

import java.util.List;

import com.benliu.entity.Area;

/**
 * Created by Administrator on 2017/12/28.
 */
public interface AreaMapper {
    
    List<Area> getAreasByCityId(int cityId);

    Area getAreaById(int areaId);
}
