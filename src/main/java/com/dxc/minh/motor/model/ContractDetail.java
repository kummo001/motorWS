package com.dxc.minh.motor.model;

public class ContractDetail {
	private String policyNo;
	private String coverNote;
	private String policyOwner;
	private Double annualPremium;
	private Double postedPremium;
	private String status;
	private String error;
	private String currency;
	
	public ContractDetail() {
		
	}

	
	public ContractDetail(String policyNo, String coverNote, String policyOwner, Double annualPremium,
			Double postedPremium, String status, String error, String currency) {
		super();
		this.policyNo = policyNo;
		this.coverNote = coverNote;
		this.policyOwner = policyOwner;
		this.annualPremium = annualPremium;
		this.postedPremium = postedPremium;
		this.status = status;
		this.error = error;
		this.currency = currency;
	}


	public String getPolicyOwner() {
		return policyOwner;
	}


	public void setPolicyOwner(String policyOwner) {
		this.policyOwner = policyOwner;
	}


	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getCoverNote() {
		return coverNote;
	}

	public void setCoverNote(String coverNote) {
		this.coverNote = coverNote;
	}

	public Double getAnnualPremium() {
		return annualPremium;
	}

	public void setAnnualPremium(Double annualPremium) {
		this.annualPremium = annualPremium;
	}

	public Double getPostedPremium() {
		return postedPremium;
	}

	public void setPostedPremium(Double postedPremium) {
		this.postedPremium = postedPremium;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
	
}
