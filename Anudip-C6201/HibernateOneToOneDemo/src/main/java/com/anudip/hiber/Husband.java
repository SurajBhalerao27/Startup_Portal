package com.anudip.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Husband {
	@Id
	private int hid;
	private String hName;
	private Wife wife;

	public Husband() {
		super();
	}

	public Husband(int hid, String hName, Wife wife) {
		super();
		this.hid = hid;
		this.hName = hName;
		this.wife = wife;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "Husband [hid=" + hid + ", hName=" + hName + ", wife=" + wife + "]";
	}

}
