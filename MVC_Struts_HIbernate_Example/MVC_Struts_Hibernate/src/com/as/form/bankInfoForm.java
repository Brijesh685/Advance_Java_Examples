package com.as.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.struts.action.ActionForm;

@Entity
@Table(name="bankinfo")
public class bankInfoForm extends ActionForm {

	private String bankname;
	private String account;
	private String ssn;
	public bankInfoForm() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name="bankname", nullable=true)
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	@Column(name="account", nullable=true)
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	@Column(name="ssn", nullable=true)
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
}
