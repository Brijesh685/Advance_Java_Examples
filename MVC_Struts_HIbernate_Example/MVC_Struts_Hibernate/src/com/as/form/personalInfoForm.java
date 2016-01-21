package com.as.form;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.struts.action.ActionForm;

@Entity
@Table(name="personalinfo")
public class personalInfoForm extends ActionForm {

	private String firstname;
	private String middlename;
	private String lastname;
	private String gender;
	
	public personalInfoForm() {
	}
	
	@Id
	@Column(name="firstName", nullable=true)
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(name="middleName" , nullable=true)
	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	@Column(name="lastName" , nullable=true)
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Column(name="gender" , nullable=true)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
