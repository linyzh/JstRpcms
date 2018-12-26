package com.benliu.entity;

import com.benliu.utils.FormatUtil;

import java.util.Date;

/**
 * 告警信息类 Created by kunlun on 2016/10/17.
 */
public class WarningInfo {
	private Date warnTime;
	private int capacitorId; // 电容器ID
	private String capacitorSecondId; // 电容器子ID
	private String warnType; // 告警类型
	private String exception; // 具体异常
	private double voltage_A;
	private double voltage_B;
	private double voltage_C;
	private double current_A;
	private double current_B;
	private double current_C;
	private double vHarmonic_A; // 电压谐波
	private double vHarmonic_B;
	private double vHarmonic_C;
	private double cHarmonic_A; // 电流谐波
	private double cHarmonic_B;
	private double cHarmonic_C;
	private double temperature;
	private int brokenTime;

	public String getWarnTime() {
		// return warnTime;
		return FormatUtil.TimeFormat(warnTime);
	}

	public void setWarnTime(Date warnTime) {
		this.warnTime = warnTime;
	}

	public int getCapacitorId() {
		return capacitorId;
	}

	public void setCapacitorId(int capacitorId) {
		this.capacitorId = capacitorId;
	}

	public String getCapacitorSecondId() {
		return capacitorSecondId;
	}

	public void setCapacitorSecondId(String capacitorSecondId) {
		this.capacitorSecondId = capacitorSecondId;
	}

	public String getWarnType() {
		return warnType;
	}

	public void setWarnType(String warnType) {
		this.warnType = warnType;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public double getVoltage_A() {
		return voltage_A;
	}

	public void setVoltage_A(double voltage_A) {
		this.voltage_A = voltage_A;
	}

	public double getVoltage_B() {
		return voltage_B;
	}

	public void setVoltage_B(double voltage_B) {
		this.voltage_B = voltage_B;
	}

	public double getVoltage_C() {
		return voltage_C;
	}

	public void setVoltage_C(double voltage_C) {
		this.voltage_C = voltage_C;
	}

	public double getCurrent_A() {
		return current_A;
	}

	public void setCurrent_A(double current_A) {
		this.current_A = current_A;
	}

	public double getCurrent_B() {
		return current_B;
	}

	public void setCurrent_B(double current_B) {
		this.current_B = current_B;
	}

	public double getCurrent_C() {
		return current_C;
	}

	public void setCurrent_C(double current_C) {
		this.current_C = current_C;
	}

	public double getvHarmonic_A() {
		return vHarmonic_A;
	}

	public void setvHarmonic_A(double vHarmonic_A) {
		this.vHarmonic_A = vHarmonic_A;
	}

	public double getvHarmonic_B() {
		return vHarmonic_B;
	}

	public void setvHarmonic_B(double vHarmonic_B) {
		this.vHarmonic_B = vHarmonic_B;
	}

	public double getvHarmonic_C() {
		return vHarmonic_C;
	}

	public void setvHarmonic_C(double vHarmonic_C) {
		this.vHarmonic_C = vHarmonic_C;
	}

	public double getcHarmonic_A() {
		return cHarmonic_A;
	}

	public void setcHarmonic_A(double cHarmonic_A) {
		this.cHarmonic_A = cHarmonic_A;
	}

	public double getcHarmonic_B() {
		return cHarmonic_B;
	}

	public void setcHarmonic_B(double cHarmonic_B) {
		this.cHarmonic_B = cHarmonic_B;
	}

	public double getcHarmonic_C() {
		return cHarmonic_C;
	}

	public void setcHarmonic_C(double cHarmonic_C) {
		this.cHarmonic_C = cHarmonic_C;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public int getBrokenTime() {
		return brokenTime;
	}

	public void setBrokenTime(int brokenTime) {
		this.brokenTime = brokenTime;
	}

}
