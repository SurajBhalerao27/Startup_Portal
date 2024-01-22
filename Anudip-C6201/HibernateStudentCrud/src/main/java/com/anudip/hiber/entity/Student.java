package com.anudip.hiber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_info")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stId;
	@Column(name = "FullName", length = 20)
	private String stName;
	@Column(name = "Email", length = 50)
	private String email;
	@Column(name = "MobileNo", length = 20)
	private long phone;
	@Column(name = "CourseName", length = 20)
	private String course;

	public Student(int stId, String stName, String email, long phone, String course) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.email = email;
		this.phone = phone;
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", email=" + email + ", phone=" + phone + ", course="
				+ course + "]";
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
