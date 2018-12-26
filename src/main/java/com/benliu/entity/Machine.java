package com.benliu.entity;

import net.sf.json.JSONObject;

/**
 * Created by kunlun on 2017/1/12.
 */
public class Machine {
    private int id;
    private String address;
    private String name;
    private int lineId;

    private String placeTime;


    private String type;
    private float capCap;//电容器
    private float capReg;//调压器

    private JSONObject vMac;


    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JSONObject getvMac() {
        return vMac;
    }

    public void setvMac(JSONObject vMac) {
        this.vMac = vMac;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCapCap() {
        return capCap;
    }

    public void setCapCap(float capCap) {
        this.capCap = capCap;
    }

    public float getCapReg() {
        return capReg;
    }

    public void setCapReg(float capReg) {
        this.capReg = capReg;
    }

    public String getPlaceTime() {
        return placeTime;
    }

    public void setPlaceTime(String placeTime) {
        this.placeTime = placeTime;
    }

    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("id", id);
        object.put("address", address);
        object.put("name", name);
        object.put("lineId", lineId);
        //if ()
        object.put("vMac", vMac);
        object.put("type", type);
        object.put("capCap", capCap);
        object.put("capReg", capReg);
        object.put("placeTime", placeTime);


        return object;

    }

}
