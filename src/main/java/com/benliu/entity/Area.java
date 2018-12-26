package com.benliu.entity;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Created by Administrator on 2017/12/28.
 */
public class Area {
    private int areaId;
    private String areaName;
    private String areaPlace;
    private int cityId;
    private JSONArray lineList;


    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaPlace() {
        return areaPlace;
    }

    public void setAreaPlace(String areaPlace) {
        this.areaPlace = areaPlace;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public JSONArray getLineList() {
        return lineList;
    }

    public void setLineList(JSONArray lineList) {
        this.lineList = lineList;
    }

    public JSONObject toJSON() {
        this.setLineList(new JSONArray());
        return JSONObject.fromObject(this);
    }
}
