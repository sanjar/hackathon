package org.mbrdi.helpinghand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="helping_hand_user")
public class User {

	@Id
	@Column(name="user_id")
	private String userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_full_name")
	private String userFullName;
	
	@Column(name="user_email")
	private String userEmail;
	
	@Column(name="user_department")
	private String userDepartment;
	
	@Column(name="user_contact_number")
	private String userContactNumber;
	
}
