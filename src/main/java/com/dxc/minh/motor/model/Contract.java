package com.dxc.minh.motor.model;

import java.util.Date;

public class Contract {
	private String CoverNote;
	private String inceptionDate;
	private String expiryDate;
	private String clientSecurityNum;
	private String engineNo;
	private String chassisNo;
	private String vehicleRegisNo;
	private String Currency;
	private double sumInsured;
	private double rate;
	
	
	
	

	public Contract(String coverNote, String expiryDate, String clientSecurityNum, String engineNo, String chassisNo,
			String vehicleRegisNo, String currency, double sumInsured, double rate) {
		super();
		CoverNote = coverNote;
		this.inceptionDate = "2021-03-07";
		this.expiryDate = expiryDate;
		this.clientSecurityNum = clientSecurityNum;
		this.engineNo = engineNo;
		this.chassisNo = chassisNo;
		this.vehicleRegisNo = vehicleRegisNo;
		Currency = currency;
		this.sumInsured = sumInsured;
		this.rate = rate;
	}

	public Contract() {
		
	}

	public String getCoverNote() {
		return CoverNote;
	}

	public void setCoverNote(String coverNote) {
		CoverNote = coverNote;
	}

	public String getInceptionDate() {
		return inceptionDate;
	}

	public void setInceptionDate(String inceptionDate) {
		this.inceptionDate = inceptionDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getClientSecurityNum() {
		return clientSecurityNum;
	}

	public void setClientSecurityNum(String clientSecurityNum) {
		this.clientSecurityNum = clientSecurityNum;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getChassisNo() {
		return chassisNo;
	}

	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}

	public String getVehicleRegisNo() {
		return vehicleRegisNo;
	}

	public void setVehicleRegisNo(String vehicleRegisNo) {
		this.vehicleRegisNo = vehicleRegisNo;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public double getSumInsured() {
		return sumInsured;
	}

	public void setSumInsured(double sumInsured) {
		this.sumInsured = sumInsured;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Contract [CoverNote=" + CoverNote + ", inceptionDate=" + inceptionDate + ", expiryDate=" + expiryDate
				+ ", clientSecurityNum=" + clientSecurityNum + ", engineNo=" + engineNo + ", chassisNo=" + chassisNo
				+ ", vehicleRegisNo=" + vehicleRegisNo + ", Currency=" + Currency + ", sumInsured=" + sumInsured
				+ ", rate=" + rate + "]";
	}
	
}
