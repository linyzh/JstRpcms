package com.benliu.entity;

import com.benliu.utils.FormatUtil;
import net.sf.json.JSONObject;

import java.util.Date;

/**
 * 实时数据类
 * Created by kunlun on 2016/10/18.
 */

public class RealData {
    private Date repoTime;     //上报时间
    private double voltage_A;  //A相电压
    private double voltage_B;  //B相电压
    private double voltage_C;  //C相电压

    private double current_A;  //A相电流
    private double current_B;  //B相电流
    private double current_C;  //C相电流

    private double reactivePower_A;  //A相无功功率
    private double reactivePower_B;  //B相无功功率
    private double reactivePower_C;  //C相无功功率
    private double reactivePower_sum;  //总无功功率

    private double activePower_A;  //A相有功功率
    private double activePower_B;  //B相有功功率
    private double activePower_C;  //C相有功功率
    private double activePower_sum;  //总有功功率

    private double powerFactor_A;  //A相功率因数
    private double powerFactor_B;  //B相功率因数
    private double powerFactor_C;  //C相功率因数
    private double powerFactor_sum;  //总功率因数

    private double apparentPower_A;  //A相视在功率
    private double apparentPower_B;  //B相视在功率
    private double apparentPower_C;  //C相视在功率
    private double apparentPower_sum;  //总视在功率

    private double V_Harmonic_A_3;  //A相3次电压谐波
    private double V_Harmonic_A_5;  //A相5次电压谐波
    private double V_Harmonic_A_7;  //A相7次电压谐波
    private double V_Harmonic_A_9;  //A相9次电压谐波
    private double V_Harmonic_A_11;  //A相11次电压谐波
    private double V_Harmonic_A_sum;  //A相总电压谐波

    private double V_Harmonic_B_3;  //B相3次电压谐波
    private double V_Harmonic_B_5;  //B相5次电压谐波
    private double V_Harmonic_B_7;  //B相7次电压谐波
    private double V_Harmonic_B_9;  //B相9次电压谐波
    private double V_Harmonic_B_11;  //B相11次电压谐波
    private double V_Harmonic_B_sum;  //B相总电压谐波

    private double V_Harmonic_C_3;  //C相3次电压谐波
    private double V_Harmonic_C_5;  //C相5次电压谐波
    private double V_Harmonic_C_7;  //C相7次电压谐波
    private double V_Harmonic_C_9;  //C相9次电压谐波
    private double V_Harmonic_C_11;  //C相11次电压谐波
    private double V_Harmonic_C_sum;  //C相总电压谐波

    private double A_Harmonic_A_3;  //A相3次电流谐波
    private double A_Harmonic_A_5;  //A相5次电流谐波
    private double A_Harmonic_A_7;  //A相7次电流谐波
    private double A_Harmonic_A_9;  //A相9次电流谐波
    private double A_Harmonic_A_11;  //A相11次电流谐波
    private double A_Harmonic_A_sum;  //A相总电流谐波

    private double A_Harmonic_B_3;  //B相3次电流谐波
    private double A_Harmonic_B_5;  //B相5次电流谐波
    private double A_Harmonic_B_7;  //B相7次电流谐波
    private double A_Harmonic_B_9;  //B相9次电流谐波
    private double A_Harmonic_B_11;  //B相11次电流谐波
    private double A_Harmonic_B_sum;  //B相总电流谐波

    private double A_Harmonic_C_3;  //C相3次电流谐波
    private double A_Harmonic_C_5;  //C相5次电流谐波
    private double A_Harmonic_C_7;  //C相7次电流谐波
    private double A_Harmonic_C_9;  //C相9次电流谐波
    private double A_Harmonic_C_11;  //C相11次电流谐波
    private double A_Harmonic_C_sum;  //C相总电流谐波

    private double gridFrequency;  //电网频率

    public String getRepoTime() {
        return FormatUtil.TimeFormat(repoTime);
    }

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

    public void setReactivePower_A(double reactivePower_A) {
        this.reactivePower_A = reactivePower_A;
    }

    public void setReactivePower_B(double reactivePower_B) {
        this.reactivePower_B = reactivePower_B;
    }

    public void setReactivePower_C(double reactivePower_C) {
        this.reactivePower_C = reactivePower_C;
    }

    public void setReactivePower_sum(double reactivePower_sum) {
        this.reactivePower_sum = reactivePower_sum;
    }

    public void setActivePower_A(double activePower_A) {
        this.activePower_A = activePower_A;
    }

    public void setActivePower_B(double activePower_B) {
        this.activePower_B = activePower_B;
    }

    public void setActivePower_C(double activePower_C) {
        this.activePower_C = activePower_C;
    }

    public void setActivePower_sum(double activePower_sum) {
        this.activePower_sum = activePower_sum;
    }

    public void setPowerFactor_A(double powerFactor_A) {
        this.powerFactor_A = powerFactor_A;
    }

    public void setPowerFactor_B(double powerFactor_B) {
        this.powerFactor_B = powerFactor_B;
    }

    public void setPowerFactor_C(double powerFactor_C) {
        this.powerFactor_C = powerFactor_C;
    }

    public void setPowerFactor_sum(double powerFactor_sum) {
        this.powerFactor_sum = powerFactor_sum;
    }

    public void setApparentPower_A(double apparentPower_A) {
        this.apparentPower_A = apparentPower_A;
    }

    public void setApparentPower_B(double apparentPower_B) {
        this.apparentPower_B = apparentPower_B;
    }

    public void setApparentPower_C(double apparentPower_C) {
        this.apparentPower_C = apparentPower_C;
    }

    public void setApparentPower_sum(double apparentPower_sum) {
        this.apparentPower_sum = apparentPower_sum;
    }

    public void setV_Harmonic_A_3(double v_Harmonic_A_3) {
        V_Harmonic_A_3 = v_Harmonic_A_3;
    }

    public void setV_Harmonic_A_5(double v_Harmonic_A_5) {
        V_Harmonic_A_5 = v_Harmonic_A_5;
    }

    public void setV_Harmonic_A_7(double v_Harmonic_A_7) {
        V_Harmonic_A_7 = v_Harmonic_A_7;
    }

    public void setV_Harmonic_A_9(double v_Harmonic_A_9) {
        V_Harmonic_A_9 = v_Harmonic_A_9;
    }

    public void setV_Harmonic_A_11(double v_Harmonic_A_11) {
        V_Harmonic_A_11 = v_Harmonic_A_11;
    }

    public void setV_Harmonic_A_sum(double v_Harmonic_A_sum) {
        V_Harmonic_A_sum = v_Harmonic_A_sum;
    }

    public void setV_Harmonic_B_3(double v_Harmonic_B_3) {
        V_Harmonic_B_3 = v_Harmonic_B_3;
    }

    public void setV_Harmonic_B_5(double v_Harmonic_B_5) {
        V_Harmonic_B_5 = v_Harmonic_B_5;
    }

    public void setV_Harmonic_B_7(double v_Harmonic_B_7) {
        V_Harmonic_B_7 = v_Harmonic_B_7;
    }

    public void setV_Harmonic_B_9(double v_Harmonic_B_9) {
        V_Harmonic_B_9 = v_Harmonic_B_9;
    }

    public void setV_Harmonic_B_11(double v_Harmonic_B_11) {
        V_Harmonic_B_11 = v_Harmonic_B_11;
    }

    public void setV_Harmonic_B_sum(double v_Harmonic_B_sum) {
        V_Harmonic_B_sum = v_Harmonic_B_sum;
    }

    public void setV_Harmonic_C_3(double v_Harmonic_C_3) {
        V_Harmonic_C_3 = v_Harmonic_C_3;
    }

    public void setV_Harmonic_C_5(double v_Harmonic_C_5) {
        V_Harmonic_C_5 = v_Harmonic_C_5;
    }

    public void setV_Harmonic_C_7(double v_Harmonic_C_7) {
        V_Harmonic_C_7 = v_Harmonic_C_7;
    }

    public void setV_Harmonic_C_9(double v_Harmonic_C_9) {
        V_Harmonic_C_9 = v_Harmonic_C_9;
    }

    public void setV_Harmonic_C_11(double v_Harmonic_C_11) {
        V_Harmonic_C_11 = v_Harmonic_C_11;
    }

    public void setV_Harmonic_C_sum(double v_Harmonic_C_sum) {
        V_Harmonic_C_sum = v_Harmonic_C_sum;
    }

    public void setA_Harmonic_A_3(double a_Harmonic_A_3) {
        A_Harmonic_A_3 = a_Harmonic_A_3;
    }

    public void setA_Harmonic_A_5(double a_Harmonic_A_5) {
        A_Harmonic_A_5 = a_Harmonic_A_5;
    }

    public void setA_Harmonic_A_7(double a_Harmonic_A_7) {
        A_Harmonic_A_7 = a_Harmonic_A_7;
    }

    public void setA_Harmonic_A_9(double a_Harmonic_A_9) {
        A_Harmonic_A_9 = a_Harmonic_A_9;
    }

    public void setA_Harmonic_A_11(double a_Harmonic_A_11) {
        A_Harmonic_A_11 = a_Harmonic_A_11;
    }

    public void setA_Harmonic_A_sum(double a_Harmonic_A_sum) {
        A_Harmonic_A_sum = a_Harmonic_A_sum;
    }

    public void setA_Harmonic_B_3(double a_Harmonic_B_3) {
        A_Harmonic_B_3 = a_Harmonic_B_3;
    }

    public void setA_Harmonic_B_5(double a_Harmonic_B_5) {
        A_Harmonic_B_5 = a_Harmonic_B_5;
    }

    public void setA_Harmonic_B_7(double a_Harmonic_B_7) {
        A_Harmonic_B_7 = a_Harmonic_B_7;
    }

    public void setA_Harmonic_B_9(double a_Harmonic_B_9) {
        A_Harmonic_B_9 = a_Harmonic_B_9;
    }

    public void setA_Harmonic_B_11(double a_Harmonic_B_11) {
        A_Harmonic_B_11 = a_Harmonic_B_11;
    }

    public void setA_Harmonic_B_sum(double a_Harmonic_B_sum) {
        A_Harmonic_B_sum = a_Harmonic_B_sum;
    }

    public void setA_Harmonic_C_3(double a_Harmonic_C_3) {
        A_Harmonic_C_3 = a_Harmonic_C_3;
    }

    public void setA_Harmonic_C_5(double a_Harmonic_C_5) {
        A_Harmonic_C_5 = a_Harmonic_C_5;
    }

    public void setA_Harmonic_C_7(double a_Harmonic_C_7) {
        A_Harmonic_C_7 = a_Harmonic_C_7;
    }

    public void setA_Harmonic_C_9(double a_Harmonic_C_9) {
        A_Harmonic_C_9 = a_Harmonic_C_9;
    }

    public void setA_Harmonic_C_11(double a_Harmonic_C_11) {
        A_Harmonic_C_11 = a_Harmonic_C_11;
    }

    public void setA_Harmonic_C_sum(double a_Harmonic_C_sum) {
        A_Harmonic_C_sum = a_Harmonic_C_sum;
    }

    public double getGridFrequency() {
        return gridFrequency;
    }

    public void setGridFrequency(double gridFrequency) {
        this.gridFrequency = gridFrequency;
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

    private double getReactivePower_A() {
        return reactivePower_A;
    }

    private double getReactivePower_B() {
        return reactivePower_B;
    }

    private double getReactivePower_C() {
        return reactivePower_C;
    }

    private double getReactivePower_sum() {
        return reactivePower_sum;
    }

    private double getActivePower_A() {
        return activePower_A;
    }

    private double getActivePower_B() {
        return activePower_B;
    }

    private double getActivePower_C() {
        return activePower_C;
    }

    private double getActivePower_sum() {
        return activePower_sum;
    }

    private double getPowerFactor_A() {
        return powerFactor_A;
    }

    private double getPowerFactor_B() {
        return powerFactor_B;
    }

    private double getPowerFactor_C() {
        return powerFactor_C;
    }

    private double getPowerFactor_sum() {
        return powerFactor_sum;
    }

    private double getApparentPower_A() {
        return apparentPower_A;
    }

    private double getApparentPower_B() {
        return apparentPower_B;
    }

    private double getApparentPower_C() {
        return apparentPower_C;
    }

    private double getApparentPower_sum() {
        return apparentPower_sum;
    }

    private double getV_Harmonic_A_3() {
        return V_Harmonic_A_3;
    }

    private double getV_Harmonic_A_5() {
        return V_Harmonic_A_5;
    }

    private double getV_Harmonic_A_7() {
        return V_Harmonic_A_7;
    }

    private double getV_Harmonic_A_9() {
        return V_Harmonic_A_9;
    }

    private double getV_Harmonic_A_11() {
        return V_Harmonic_A_11;
    }

    private double getV_Harmonic_A_sum() {
        return V_Harmonic_A_sum;
    }

    private double getV_Harmonic_B_3() {
        return V_Harmonic_B_3;
    }

    private double getV_Harmonic_B_5() {
        return V_Harmonic_B_5;
    }

    private double getV_Harmonic_B_7() {
        return V_Harmonic_B_7;
    }

    private double getV_Harmonic_B_9() {
        return V_Harmonic_B_9;
    }

    private double getV_Harmonic_B_11() {
        return V_Harmonic_B_11;
    }

    private double getV_Harmonic_B_sum() {
        return V_Harmonic_B_sum;
    }

    private double getV_Harmonic_C_3() {
        return V_Harmonic_C_3;
    }

    private double getV_Harmonic_C_5() {
        return V_Harmonic_C_5;
    }

    private double getV_Harmonic_C_7() {
        return V_Harmonic_C_7;
    }

    private double getV_Harmonic_C_9() {
        return V_Harmonic_C_9;
    }

    private double getV_Harmonic_C_11() {
        return V_Harmonic_C_11;
    }

    private double getV_Harmonic_C_sum() {
        return V_Harmonic_C_sum;
    }

    private double getA_Harmonic_A_3() {
        return A_Harmonic_A_3;
    }

    private double getA_Harmonic_A_5() {
        return A_Harmonic_A_5;
    }

    private double getA_Harmonic_A_7() {
        return A_Harmonic_A_7;
    }

    private double getA_Harmonic_A_9() {
        return A_Harmonic_A_9;
    }

    private double getA_Harmonic_A_11() {
        return A_Harmonic_A_11;
    }

    private double getA_Harmonic_A_sum() {
        return A_Harmonic_A_sum;
    }

    private double getA_Harmonic_B_3() {
        return A_Harmonic_B_3;
    }

    private double getA_Harmonic_B_5() {
        return A_Harmonic_B_5;
    }

    private double getA_Harmonic_B_7() {
        return A_Harmonic_B_7;
    }

    private double getA_Harmonic_B_9() {
        return A_Harmonic_B_9;
    }

    private double getA_Harmonic_B_11() {
        return A_Harmonic_B_11;
    }

    private double getA_Harmonic_B_sum() {
        return A_Harmonic_B_sum;
    }

    private double getA_Harmonic_C_3() {
        return A_Harmonic_C_3;
    }

    private double getA_Harmonic_C_5() {
        return A_Harmonic_C_5;
    }

    private double getA_Harmonic_C_7() {
        return A_Harmonic_C_7;
    }

    private double getA_Harmonic_C_9() {
        return A_Harmonic_C_9;
    }

    private double getA_Harmonic_C_11() {
        return A_Harmonic_C_11;
    }

    private double getA_Harmonic_C_sum() {
        return A_Harmonic_C_sum;
    }

    private JSONObject getVoltage() {
        JSONObject voltage = new JSONObject();
        voltage.put("repoTime", getRepoTime());
        voltage.put("data_B", getVoltage_B());
        voltage.put("data_A", getVoltage_A());
        voltage.put("data_C", getVoltage_C());
        return voltage;
    }

    private JSONObject getCurrent() {
        JSONObject current = new JSONObject();
        current.put("repoTime", getRepoTime());
        current.put("data_B", getCurrent_B());
        current.put("data_A", getCurrent_A());
        current.put("data_C", getCurrent_C());
        return current;
    }

    private JSONObject getReactivePower() {
        JSONObject reactivePower = new JSONObject();
        reactivePower.put("repoTime", getRepoTime());
        reactivePower.put("data_A", getReactivePower_A());
        reactivePower.put("data_B", getReactivePower_B());
        reactivePower.put("data_C", getReactivePower_C());
        reactivePower.put("data_sum", getReactivePower_sum());
        return reactivePower;
    }

    private JSONObject getActivePower() {
        JSONObject ActivePower = new JSONObject();
        ActivePower.put("repoTime", getRepoTime());
        ActivePower.put("data_A", getActivePower_A());
        ActivePower.put("data_B", getActivePower_B());
        ActivePower.put("data_C", getActivePower_C());
        ActivePower.put("data_sum", getActivePower_sum());
        return ActivePower;
    }

    private JSONObject getPowerFactor() {
        JSONObject PowerFactor = new JSONObject();
        PowerFactor.put("repoTime", getRepoTime());
        PowerFactor.put("data_A", getPowerFactor_A());
        PowerFactor.put("data_B", getPowerFactor_B());
        PowerFactor.put("data_C", getPowerFactor_C());
        PowerFactor.put("data_sum", getPowerFactor_sum());
        return PowerFactor;
    }

    private JSONObject getApparentPower() {
        JSONObject ApparentPower = new JSONObject();
        ApparentPower.put("repoTime", getRepoTime());
        ApparentPower.put("data_A", getApparentPower_A());
        ApparentPower.put("data_B", getApparentPower_B());
        ApparentPower.put("data_C", getApparentPower_C());
        ApparentPower.put("data_sum", getApparentPower_sum());
        return ApparentPower;
    }

    private JSONObject getV_Harmonic_A() {
        JSONObject V_Harmonic_A = new JSONObject();
        V_Harmonic_A.put("repoTime", getRepoTime());
        V_Harmonic_A.put("data_3", getV_Harmonic_A_3());
        V_Harmonic_A.put("data_5", getV_Harmonic_A_5());
        V_Harmonic_A.put("data_7", getV_Harmonic_A_7());
        V_Harmonic_A.put("data_9", getV_Harmonic_A_9());
        V_Harmonic_A.put("data_11", getV_Harmonic_A_11());
        V_Harmonic_A.put("data_sum", getV_Harmonic_A_sum());
        return V_Harmonic_A;
    }

    private JSONObject getV_Harmonic_B() {
        JSONObject V_Harmonic_B = new JSONObject();
        V_Harmonic_B.put("repoTime", getRepoTime());
        V_Harmonic_B.put("data_3", getV_Harmonic_B_3());
        V_Harmonic_B.put("data_5", getV_Harmonic_B_5());
        V_Harmonic_B.put("data_7", getV_Harmonic_B_7());
        V_Harmonic_B.put("data_9", getV_Harmonic_B_9());
        V_Harmonic_B.put("data_11", getV_Harmonic_B_11());
        V_Harmonic_B.put("data_sum", getV_Harmonic_B_sum());
        return V_Harmonic_B;
    }

    private JSONObject getV_Harmonic_C() {
        JSONObject V_Harmonic_C = new JSONObject();
        V_Harmonic_C.put("repoTime", getRepoTime());
        V_Harmonic_C.put("data_3", getV_Harmonic_C_3());
        V_Harmonic_C.put("data_5", getV_Harmonic_C_5());
        V_Harmonic_C.put("data_7", getV_Harmonic_C_7());
        V_Harmonic_C.put("data_9", getV_Harmonic_C_9());
        V_Harmonic_C.put("data_11", getV_Harmonic_C_11());
        V_Harmonic_C.put("data_sum", getV_Harmonic_C_sum());
        return V_Harmonic_C;
    }

    private JSONObject getA_Harmonic_A() {
        JSONObject A_Harmonic_A = new JSONObject();
        A_Harmonic_A.put("repoTime", getRepoTime());
        A_Harmonic_A.put("data_3", getA_Harmonic_A_3());
        A_Harmonic_A.put("data_5", getA_Harmonic_A_5());
        A_Harmonic_A.put("data_7", getA_Harmonic_A_7());
        A_Harmonic_A.put("data_9", getA_Harmonic_A_9());
        A_Harmonic_A.put("data_11", getA_Harmonic_A_11());
        A_Harmonic_A.put("data_sum", getA_Harmonic_A_sum());
        return A_Harmonic_A;
    }

    private JSONObject getA_Harmonic_B() {
        JSONObject A_Harmonic_B = new JSONObject();
        A_Harmonic_B.put("repoTime", getRepoTime());
        A_Harmonic_B.put("data_3", getA_Harmonic_B_3());
        A_Harmonic_B.put("data_5", getA_Harmonic_B_5());
        A_Harmonic_B.put("data_7", getA_Harmonic_B_7());
        A_Harmonic_B.put("data_9", getA_Harmonic_B_9());
        A_Harmonic_B.put("data_11", getA_Harmonic_B_11());
        A_Harmonic_B.put("data_sum", getA_Harmonic_B_sum());
        return A_Harmonic_B;
    }

    private JSONObject getA_Harmonic_C() {
        JSONObject A_Harmonic_C = new JSONObject();
        A_Harmonic_C.put("repoTime", getRepoTime());
        A_Harmonic_C.put("data_3", getA_Harmonic_C_3());
        A_Harmonic_C.put("data_5", getA_Harmonic_C_5());
        A_Harmonic_C.put("data_7", getA_Harmonic_C_7());
        A_Harmonic_C.put("data_9", getA_Harmonic_C_9());
        A_Harmonic_C.put("data_11", getA_Harmonic_C_11());
        A_Harmonic_C.put("data_sum", getA_Harmonic_C_sum());
        return A_Harmonic_C;
    }

    public JSONObject RDtoJSON(int type) {
        switch (type) {
            case 1:
                return getVoltage();
            case 2:
                return getCurrent();
            case 3:
                return getReactivePower();
            case 4:
                return getActivePower();
            case 5:
                return getPowerFactor();
            case 6:
                return getApparentPower();
            case 71:
                return getV_Harmonic_A();
            case 72:
                return getV_Harmonic_B();
            case 73:
                return getV_Harmonic_C();
            case 81:
                return getA_Harmonic_A();
            case 82:
                return getA_Harmonic_B();
            case 83:
                return getA_Harmonic_C();
            default:
                return new JSONObject();
        }
    }


}
