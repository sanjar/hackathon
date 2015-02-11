package org.mbrdi.helpinghand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="helping_hand_user")
public class User {

	@Id
	@Column(name="emp_no")
	private String empNumber;
	
	@Column(name="user_contact_number")
	private String contactNumber;
	
	@Column(name="user_department")
	private String department;
	
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_full_name")
	private String userFullName;
	
	@Column(name="user_email")
	private String userEmail;
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmpNumber() {
		return empNumber;
	}

	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}
	
}
