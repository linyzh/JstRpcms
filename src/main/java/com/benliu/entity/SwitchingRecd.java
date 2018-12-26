package com.benliu.entity;

import com.benliu.utils.FormatUtil;
import net.sf.json.JSONObject;

import java.util.Date;

/**
 * 投切记录类
 * Created by kunlun on 2016/10/17.
 */
public class SwitchingRecd {
    private Date switchingTime;
    private String capacitorId; //电容器ID
    private String capacitorSecondId; //电容器子ID
    private int switchingActionId; //投切动作
    private int switchingReasonId; //投切原因

    private double V_A_be4Action; //动作前A相电压
    private double V_B_be4Action; //动作前B相电压
    private double V_C_be4Action; //动作前C相电压

    private double V_A_afterAction; //动作后A相电压
    private double V_B_afterAction; //动作后B相电压
    private double V_C_afterAction; //动作后C相电压

    private double A_A_be4Action; //动作前A相电流
    private double A_B_be4Action; //动作前B相电流
    private double A_C_be4Action; //动作前C相电流

    private double A_A_afterAction; //动作后A相电流
    private double A_B_afterAction; //动作后B相电流
    private double A_C_afterAction; //动作后C相电流

    private double RP_A_be4Action;  //动作前A相无功功率
    private double RP_B_be4Action;  //动作前B相无功功率
    private double RP_C_be4Action;  //动作前C相无功功率
    private double RP_sum_be4Action;  //动作前总无功功率

    private double AP_A_be4Action;  //动作前A相有功功率
    private double AP_B_be4Action;  //动作前B相有功功率
    private double AP_C_be4Action;  //动作前C相有功功率
    private double AP_sum_be4Action;  //动作前总有功功率

    private double PF_A_be4Action;  //动作前A相功率因数
    private double PF_B_be4Action;  //动作前B相功率因数
    private double PF_C_be4Action;  //动作前C相功率因数
    private double PF_sum_be4Action;  //动作前总功率因数

    private double RP_A_afterAction;  //动作后A相无功功率
    private double RP_B_afterAction;  //动作后B相无功功率
    private double RP_C_afterAction;  //动作后C相无功功率
    private double RP_sum_afterAction;  //动作后总无功功率

    private double AP_A_afterAction;  //动作后A相有功功率
    private double AP_B_afterAction;  //动作后B相有功功率
    private double AP_C_afterAction;  //动作后C相有功功率
    private double AP_sum_afterAction;  //动作后总有功功率

    private double PF_A_afterAction;  //动作后A相功率因数
    private double PF_B_afterAction;  //动作后B相功率因数
    private double PF_C_afterAction;  //动作后C相功率因数
    private double PF_sum_afterAction;  //动作后总功率因数

    public String getSwitchingTime() {
        //return switchingTime;

        return FormatUtil.TimeFormat(switchingTime);

        //return FormatUtil.TimeFormat3(switchingTime);
    }

    public void setSwitchingTime(Date switchingTime) {
        this.switchingTime = switchingTime;
    }

    public String getCapacitorId() {
        return capacitorId;
    }

    public void setCapacitorId(String capacitorId) {
        this.capacitorId = capacitorId;
    }

    public String getCapacitorSecondId() {
        return capacitorSecondId;
    }

    public void setCapacitorSecondId(String capacitorSecondId) {
        this.capacitorSecondId = capacitorSecondId;
    }

    public int getSwitchingActionId() {
        return switchingActionId;
    }

    public void setSwitchingActionId(int switchingActionId) {
        this.switchingActionId = switchingActionId;
    }

    public int getSwitchingReasonId() {
        return switchingReasonId;
    }

    public void setSwitchingReasonId(int switchingReasonId) {
        this.switchingReasonId = switchingReasonId;
    }

    private double getV_A_be4Action() {
        return V_A_be4Action;
    }

    public void setV_A_be4Action(double v_A_be4Action) {
        V_A_be4Action = v_A_be4Action;
    }

    private double getV_B_be4Action() {
        return V_B_be4Action;
    }

    public void setV_B_be4Action(double v_B_be4Action) {
        V_B_be4Action = v_B_be4Action;
    }

    private double getV_C_be4Action() {
        return V_C_be4Action;
    }

    public void setV_C_be4Action(double v_C_be4Action) {
        V_C_be4Action = v_C_be4Action;
    }

    private double getV_A_afterAction() {
        return V_A_afterAction;
    }

    public void setV_A_afterAction(double v_A_afterAction) {
        V_A_afterAction = v_A_afterAction;
    }

    private double getV_B_afterAction() {
        return V_B_afterAction;
    }

    public void setV_B_afterAction(double v_B_afterAction) {
        V_B_afterAction = v_B_afterAction;
    }

    private double getV_C_afterAction() {
        return V_C_afterAction;
    }

    public void setV_C_afterAction(double v_C_afterAction) {
        V_C_afterAction = v_C_afterAction;
    }

    private double getA_A_be4Action() {
        return A_A_be4Action;
    }

    public void setA_A_be4Action(double a_A_be4Action) {
        A_A_be4Action = a_A_be4Action;
    }

    private double getA_B_be4Action() {
        return A_B_be4Action;
    }

    public void setA_B_be4Action(double a_B_be4Action) {
        A_B_be4Action = a_B_be4Action;
    }

    private double getA_C_be4Action() {
        return A_C_be4Action;
    }

    public void setA_C_be4Action(double a_C_be4Action) {
        A_C_be4Action = a_C_be4Action;
    }

    private double getA_A_afterAction() {
        return A_A_afterAction;
    }

    public void setA_A_afterAction(double a_A_afterAction) {
        A_A_afterAction = a_A_afterAction;
    }

    private double getA_B_afterAction() {
        return A_B_afterAction;
    }

    public void setA_B_afterAction(double a_B_afterAction) {
        A_B_afterAction = a_B_afterAction;
    }

    private double getA_C_afterAction() {
        return A_C_afterAction;
    }

    public void setA_C_afterAction(double a_C_afterAction) {
        A_C_afterAction = a_C_afterAction;
    }

    private double getRP_A_be4Action() {
        return RP_A_be4Action;
    }

    public void setRP_A_be4Action(double RP_A_be4Action) {
        this.RP_A_be4Action = RP_A_be4Action;
    }

    private double getRP_B_be4Action() {
        return RP_B_be4Action;
    }

    public void setRP_B_be4Action(double RP_B_be4Action) {
        this.RP_B_be4Action = RP_B_be4Action;
    }

    private double getRP_C_be4Action() {
        return RP_C_be4Action;
    }

    public void setRP_C_be4Action(double RP_C_be4Action) {
        this.RP_C_be4Action = RP_C_be4Action;
    }

    private double getRP_sum_be4Action() {
        return RP_sum_be4Action;
    }

    public void setRP_sum_be4Action(double RP_sum_be4Action) {
        this.RP_sum_be4Action = RP_sum_be4Action;
    }

    private double getAP_A_be4Action() {
        return AP_A_be4Action;
    }

    public void setAP_A_be4Action(double AP_A_be4Action) {
        this.AP_A_be4Action = AP_A_be4Action;
    }

    private double getAP_B_be4Action() {
        return AP_B_be4Action;
    }

    public void setAP_B_be4Action(double AP_B_be4Action) {
        this.AP_B_be4Action = AP_B_be4Action;
    }

    private double getAP_C_be4Action() {
        return AP_C_be4Action;
    }

    public void setAP_C_be4Action(double AP_C_be4Action) {
        this.AP_C_be4Action = AP_C_be4Action;
    }

    private double getAP_sum_be4Action() {
        return AP_sum_be4Action;
    }

    public void setAP_sum_be4Action(double AP_sum_be4Action) {
        this.AP_sum_be4Action = AP_sum_be4Action;
    }

    private double getPF_A_be4Action() {
        return PF_A_be4Action;
    }

    public void setPF_A_be4Action(double PF_A_be4Action) {
        this.PF_A_be4Action = PF_A_be4Action;
    }

    private double getPF_B_be4Action() {
        return PF_B_be4Action;
    }

    public void setPF_B_be4Action(double PF_B_be4Action) {
        this.PF_B_be4Action = PF_B_be4Action;
    }

    private double getPF_C_be4Action() {
        return PF_C_be4Action;
    }

    public void setPF_C_be4Action(double PF_C_be4Action) {
        this.PF_C_be4Action = PF_C_be4Action;
    }

    private double getPF_sum_be4Action() {
        return PF_sum_be4Action;
    }

    public void setPF_sum_be4Action(double PF_sum_be4Action) {
        this.PF_sum_be4Action = PF_sum_be4Action;
    }

    private double getRP_A_afterAction() {
        return RP_A_afterAction;
    }

    public void setRP_A_afterAction(double RP_A_afterAction) {
        this.RP_A_afterAction = RP_A_afterAction;
    }

    private double getRP_B_afterAction() {
        return RP_B_afterAction;
    }

    public void setRP_B_afterAction(double RP_B_afterAction) {
        this.RP_B_afterAction = RP_B_afterAction;
    }

    private double getRP_C_afterAction() {
        return RP_C_afterAction;
    }

    public void setRP_C_afterAction(double RP_C_afterAction) {
        this.RP_C_afterAction = RP_C_afterAction;
    }

    private double getRP_sum_afterAction() {
        return RP_sum_afterAction;
    }

    public void setRP_sum_afterAction(double RP_sum_afterAction) {
        this.RP_sum_afterAction = RP_sum_afterAction;
    }

    private double getAP_A_afterAction() {
        return AP_A_afterAction;
    }

    public void setAP_A_afterAction(double AP_A_afterAction) {
        this.AP_A_afterAction = AP_A_afterAction;
    }

    private double getAP_B_afterAction() {
        return AP_B_afterAction;
    }

    public void setAP_B_afterAction(double AP_B_afterAction) {
        this.AP_B_afterAction = AP_B_afterAction;
    }

    private double getAP_C_afterAction() {
        return AP_C_afterAction;
    }

    public void setAP_C_afterAction(double AP_C_afterAction) {
        this.AP_C_afterAction = AP_C_afterAction;
    }

    private double getAP_sum_afterAction() {
        return AP_sum_afterAction;
    }

    public void setAP_sum_afterAction(double AP_sum_afterAction) {
        this.AP_sum_afterAction = AP_sum_afterAction;
    }

    private double getPF_A_afterAction() {
        return PF_A_afterAction;
    }

    public void setPF_A_afterAction(double PF_A_afterAction) {
        this.PF_A_afterAction = PF_A_afterAction;
    }

    private double getPF_B_afterAction() {
        return PF_B_afterAction;
    }

    public void setPF_B_afterAction(double PF_B_afterAction) {
        this.PF_B_afterAction = PF_B_afterAction;
    }

    private double getPF_C_afterAction() {
        return PF_C_afterAction;
    }

    public void setPF_C_afterAction(double PF_C_afterAction) {
        this.PF_C_afterAction = PF_C_afterAction;
    }

    private double getPF_sum_afterAction() {
        return PF_sum_afterAction;
    }

    public void setPF_sum_afterAction(double PF_sum_afterAction) {
        this.PF_sum_afterAction = PF_sum_afterAction;
    }


    private JSONObject getVoltage() {
        JSONObject Voltage = new JSONObject();
        Voltage.put("data_A_before", getV_A_be4Action());
        Voltage.put("data_A_after", getV_A_afterAction());
        Voltage.put("data_B_before", getV_B_be4Action());
        Voltage.put("data_B_after", getV_B_afterAction());
        Voltage.put("data_C_before", getV_C_be4Action());
        Voltage.put("data_C_after", getV_C_afterAction());
        return Voltage;
    }

    private JSONObject getCurrent() {
        JSONObject Current = new JSONObject();
        Current.put("data_A_before", getA_A_be4Action());
        Current.put("data_A_after", getA_A_afterAction());
        Current.put("data_B_before", getA_B_be4Action());
        Current.put("data_B_after", getA_B_afterAction());
        Current.put("data_C_before", getA_C_be4Action());
        Current.put("data_C_after", getA_C_afterAction());
        return Current;
    }

    private JSONObject getReactivePower() {
        JSONObject ReactivePower = new JSONObject();
        ReactivePower.put("data_A_before", getRP_A_be4Action());
        ReactivePower.put("data_A_after", getRP_A_afterAction());
        ReactivePower.put("data_B_before", getRP_B_be4Action());
        ReactivePower.put("data_B_after", getRP_B_afterAction());
        ReactivePower.put("data_C_before", getRP_C_be4Action());
        ReactivePower.put("data_C_after", getRP_C_afterAction());
        ReactivePower.put("data_sum_before", getRP_sum_be4Action());
        ReactivePower.put("data_sum_after", getRP_sum_afterAction());
        return ReactivePower;
    }

    private JSONObject getActivePower() {
        JSONObject ActivePower = new JSONObject();
        ActivePower.put("data_A_before", getAP_A_be4Action());
        ActivePower.put("data_A_after", getAP_A_afterAction());
        ActivePower.put("data_B_before", getAP_B_be4Action());
        ActivePower.put("data_B_after", getAP_B_afterAction());
        ActivePower.put("data_C_before", getAP_C_be4Action());
        ActivePower.put("data_C_after", getAP_C_afterAction());
        ActivePower.put("data_sum_before", getAP_sum_be4Action());
        ActivePower.put("data_sum_after", getAP_sum_afterAction());
        return ActivePower;
    }

    private JSONObject getPowerFactor() {
        JSONObject PowerFactor = new JSONObject();
        PowerFactor.put("data_A_before", getPF_A_be4Action());
        PowerFactor.put("data_A_after", getPF_A_afterAction());
        PowerFactor.put("data_B_before", getPF_B_be4Action());
        PowerFactor.put("data_B_after", getPF_B_afterAction());
        PowerFactor.put("data_C_before", getPF_C_be4Action());
        PowerFactor.put("data_C_after", getPF_C_afterAction());
        PowerFactor.put("data_sum_before", getPF_sum_be4Action());
        PowerFactor.put("data_sum_after", getPF_sum_afterAction());
        return PowerFactor;
    }

    public JSONObject SRtoJSON(int type) {
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
            default:
                return new JSONObject();
        }

    }

}
