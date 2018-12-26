package com.benliu.entity;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Created by Administrator on 2017/12/27.
 */
public class City {
    private int cityId;
    private int provinceId;
    private String cityName;
    private int divisionNo;
    private JSONArray areaList;


    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getDivisionNo() {
        return divisionNo;
    }

    public void setDivisionNo(int divisionNo) {
        this.divisionNo = divisionNo;
    }

    public JSONArray getAreaList() {
        return areaList;
    }

    public void setAreaList(JSONArray areaList) {
        this.areaList = areaList;
    }

    public JSONObject toJSON() {
        this.setAreaList(new JSONArray());
        return JSONObject.fromObject(this);

    }

}
