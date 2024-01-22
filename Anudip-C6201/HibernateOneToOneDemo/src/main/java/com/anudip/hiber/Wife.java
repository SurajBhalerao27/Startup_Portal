package com.anudip.hiber;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wife {
	@Id
	private int wid;
	private String wName;
	private Husband husband;

	public Wife() {
		super();
	}

	public Wife(int wid, String wName, Husband husband) {
		super();
		this.wid = wid;
		this.wName = wName;
		this.husband = husband;
	}

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public String getwName() {
		return wName;
	}

	public void setwName(String wName) {
		this.wName = wName;
	}

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

	@Override
	public String toString() {
		return "Wife [wid=" + wid + ", wName=" + wName + ", husband=" + husband + "]";
	}

}
