package com.benliu.entity;

import net.sf.json.JSONObject;

/**
 * Created by kunlun on 2016/10/30.
 */
public class AnalysisData {

    private double data_A;
    private double data_B;
    private double data_C;
    private double data_sum;
    private double data_A_Append;
    private double data_B_Append;
    private double data_C_Append;
    private String dateTime;

    private double getData_A() {
        return data_A;
    }

    public void setData_A(double data_A) {
        this.data_A = data_A;
    }

    private double getData_B() {
        return data_B;
    }

    public void setData_B(double data_B) {
        this.data_B = data_B;
    }

    private double getData_C() {
        return data_C;
    }

    public void setData_C(double data_C) {
        this.data_C = data_C;
    }

    public double getData_sum() {
        return data_sum;
    }

    public void setData_sum(double data_sum) {
        this.data_sum = data_sum;
    }

    private double getData_A_Append() {
        return data_A_Append;
    }

    public void setData_A_Append(double data_A_Append) {
        this.data_A_Append = data_A_Append;
    }

    private double getData_B_Append() {
        return data_B_Append;
    }

    public void setData_B_Append(double data_B_Append) {
        this.data_B_Append = data_B_Append;
    }

    private double getData_C_Append() {
        return data_C_Append;
    }

    public void setData_C_Append(double data_C_Append) {
        this.data_C_Append = data_C_Append;
    }

    private String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public JSONObject getPowerData() {
        JSONObject PowerData = new JSONObject();
        PowerData.put("data_A", getData_A());
        PowerData.put("data_B", getData_B());
        PowerData.put("data_C", getData_C());
        PowerData.put("data_sum", getData_sum());
        PowerData.put("dateTime", getDateTime());
        return PowerData;
    }

    public JSONObject getDoubleData() {
        JSONObject DoubleData = new JSONObject();
        DoubleData.put("data_A_input", getData_A());
        DoubleData.put("data_A_output", getData_A_Append());
        DoubleData.put("data_B_input", getData_B());
        DoubleData.put("data_B_output", getData_B_Append());
        DoubleData.put("data_C_input", getData_C());
        DoubleData.put("data_C_output", getData_C_Append());
        DoubleData.put("dateTime", getDateTime());
        return DoubleData;
    }
}
