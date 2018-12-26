package com.benliu.entity;

import net.sf.json.JSONObject;

/**
 * Created by Administrator on 2017/12/26.
 */
public class VMac {
    private int id;
    private int lineId;
    private int macId;

    private String VMacName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLineId() {
        return lineId;
    }

    public void setLineId(int lineId) {
        this.lineId = lineId;
    }

    public int getMacId() {
        return macId;
    }

    public void setMacId(int macId) {
        this.macId = macId;
    }

    public String getVMacName() {
        return VMacName;
    }

    public void setVMacName(String VMacName) {
        this.VMacName = VMacName;
    }

    public JSONObject toJSON() {
        JSONObject object = new JSONObject();
        object.put("id", id);
        object.put("lineId", lineId);
        object.put("macId", macId);
        object.put("VMacName", VMacName);

        return object;
    }

}
