package com.benliu.entity;

import net.sf.json.JSONObject;

/**
 * Created by Administrator on 2017/2/28.
 */
public class User {
    String userName;
    String passWord;
    int cityId;
    int cityType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getCityType() {
        return cityType;
    }

    public void setCityType(int cityType) {
        this.cityType = cityType;
    }

    public JSONObject toJSON() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("userName", getUserName());
        jsonObject.put("passWord", getPassWord());
        jsonObject.put("cityId", getCityId());
        jsonObject.put("cityType", getCityType());

        return jsonObject;
    }
}
