package com.anudip.hiber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees_Data")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column(name = "First_Name", length = 20)
	private String empName;
	@Column(name = "Last_Name", length = 20)
	private String surname;
	@Column(name = "Designation", length = 20, nullable = false)
	private String designation;
	@Column(name = "Mobile_No", length = 20)
	private long phone;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String surname, String designation, long phone) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.surname = surname;
		this.designation = designation;
		this.phone = phone;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", surname=" + surname + ", designation="
				+ designation + ", phone=" + phone + "]";
	}
}
