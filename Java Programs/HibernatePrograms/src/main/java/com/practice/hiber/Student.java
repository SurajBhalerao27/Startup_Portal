package com.practice.hiber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Data")
public class Student {
	@Id
	@Column(length = 10, unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	int studentID;
	@Column(name = "First_Name", length = 20)
	String firstName;
	@Column(name = "Last_Name", length = 200)
	String lastName;
	@Column(name = "Address", length = 100)
	String address;
	@Column(name = "Email", length = 20)
	String email;
	@Column(name = "Course_Name", length = 10)
	String courseName;
	@Column(name = "Total_Marks", length = 10)
	int totalMarks;

	public Student() {
		super();
	}

	public Student(int studentID, String firstName, String lastName, String address, String email, String courseName,
			int totalMarks) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.courseName = courseName;
		this.totalMarks = totalMarks;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", email=" + email + ", courseName=" + courseName + ", totalMarks=" + totalMarks + "]";
	}
}
