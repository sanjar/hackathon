package org.mbrdi.helpinghand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="helping_hand_contact")
public class Contact {

	@Id
	@GeneratedValue
	@Column(name="contact_id")
	private Integer id;
	
	@Column(name="contact_name")
	private String name;
	
	@Column(name="contact_address")
	private  String address;
	
	@Column(name="contact_number")
	private String contactNumber;
	
	@Column(name="contact_email")
	private String  email;
}
