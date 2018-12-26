package com.benliu.mapper;

import java.util.List;

import com.benliu.entity.City;

/**
 * Created by Administrator on 2017/12/27.
 */
public interface CityMapper {
    City getCithById(int cityId);

    List<City> getCitiesByProId(int proId);
}
