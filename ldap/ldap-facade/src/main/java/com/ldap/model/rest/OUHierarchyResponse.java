package com.ldap.model.rest;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

import lombok.Data;

@Data
public class OUHierarchyResponse implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 828687925899533133L;
	
	@JsonProperty("login_name")
	public String cn;
	
	@JsonProperty("user_name")
	public String sn;

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
