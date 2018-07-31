package com.ldap.model.rest;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

/**
 * OuPerson
 * @author zhangyong
 *
 */
@Data
public class OUPersonResponse implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = -2573653442241386778L;
    
	
	@JsonProperty("login_name")
	public String uid;
	
	@JsonProperty("user_name")
	public String sn;
	
	@JsonProperty("user_password")
	public String password;
	
	
	@JsonProperty("mobile")
	public String mobile;
	
	@JsonProperty("company")
	public String company;
	
	@JsonProperty("region_name")
	public String regionName;
	
	@JsonProperty("department")
	public String department;
	
	@JsonProperty("employee_type")
	public String employeeType;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
