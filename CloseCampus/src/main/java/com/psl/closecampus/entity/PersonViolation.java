package com.psl.closecampus.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")
public class PersonViolation {
	private String mac_addr;
	private Date entry_time;

	public PersonViolation() {
		// TODO Auto-generated constructor stub
	}

	public PersonViolation(String mac_addr, Date entry_time) {
		super();
		this.mac_addr = mac_addr;
		this.entry_time = entry_time;
	}

	public String getMac_addr() {
		return mac_addr;
	}

	public void setMac_addr(String mac_addr) {
		this.mac_addr = mac_addr;
	}

	public Date getEntry_time() {
		return entry_time;
	}

	public void setEntry_time(Date entry_time) {
		this.entry_time = entry_time;
	}

}
