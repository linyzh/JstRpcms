package com.benliu.entity;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Created by kunlun on 2017/1/17.
 */
public class Line {
    private int id;
    private String lineAddress;
    private String lineName;
    private JSONArray machineList;
    private int cityId;
    private int lineType;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLineAddress() {
        return lineAddress;
    }

    public void setLineAddress(String lineAddress) {
        this.lineAddress = lineAddress;
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

    public JSONArray getMachineList() {
        return machineList;
    }

    public void setMachineList(JSONArray machineList) {
        this.machineList = machineList;
    }

    public int getLineType() {
        return lineType;
    }

    public void setLineType(int lineType) {
        this.lineType = lineType;
    }

    public JSONObject toJSON() {
        this.setMachineList(new JSONArray());
        return JSONObject.fromObject(this);
    }
}
