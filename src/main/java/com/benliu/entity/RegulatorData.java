package com.benliu.entity;

import java.util.Date;

import com.benliu.utils.FormatUtil;

import net.sf.json.JSONObject;

/**
 * Created by kunlun on 2016/11/9.
 */
public class RegulatorData {
    private Date repoTime;     //上报时间
    private double voltage_A;  //A相电压
    private double voltage_B;  //B相电压
    private double voltage_C;  //C相电压

    private double current_A;  //A相电流
    private double current_B;  //B相电流
    private double current_C;  //C相电流

    public void setRepoTime(Date repoTime) {
        this.repoTime = repoTime;
    }

    public void setVoltage_A(double voltage_A) {
        this.voltage_A = voltage_A;
    }

    public void setVoltage_B(double voltage_B) {
        this.voltage_B = voltage_B;
    }

    public void setVoltage_C(double voltage_C) {
        this.voltage_C = voltage_C;
    }

    public void setCurrent_A(double current_A) {
        this.current_A = current_A;
    }

    public void setCurrent_B(double current_B) {
        this.current_B = current_B;
    }

    public void setCurrent_C(double current_C) {
        this.current_C = current_C;
    }

    private String getRepoTime() {
        return FormatUtil.TimeFormat(repoTime);
    }

    private double getVoltage_A() {
        return voltage_A;
    }

    private double getVoltage_B() {
        return voltage_B;
    }

    private double getVoltage_C() {
        return voltage_C;
    }

    private double getCurrent_A() {
        return current_A;
    }

    private double getCurrent_B() {
        return current_B;
    }

    private double getCurrent_C() {
        return current_C;
    }

    private JSONObject getVoltage() {
        JSONObject voltage = new JSONObject();
        voltage.put("repoTime", getRepoTime());
        voltage.put("data_A", getVoltage_A());
        voltage.put("data_B", getVoltage_B());
        voltage.put("data_C", getVoltage_C());
        return voltage;
    }

    private JSONObject getCurrent() {
        JSONObject current = new JSONObject();
        current.put("repoTime", getRepoTime());
        current.put("data_A", getCurrent_A());
        current.put("data_B", getCurrent_B());
        current.put("data_C", getCurrent_C());
        return current;
    }

    public JSONObject getRDJSON(int type) {
        switch (type) {
            case 1:
                return getVoltage();

            case 2:
                return getCurrent();

            default:
                return new JSONObject();

        }
    }

}
