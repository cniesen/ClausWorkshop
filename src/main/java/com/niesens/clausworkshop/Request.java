package com.niesens.clausworkshop;

import java.util.Date;

import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

public class Request extends PersistableBusinessObjectBase {

	private static final long serialVersionUID = 1326930685254961234L;

	private Long id;
	private Date date;
	private String beneficiary;
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(String beneficiary) {
		this.beneficiary = beneficiary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
