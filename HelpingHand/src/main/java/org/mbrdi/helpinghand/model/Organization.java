package org.mbrdi.helpinghand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="helping_hand_organization")
public class Organization {

	@Id
	@GeneratedValue
	@Column(name="organization_id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="about")
	private String about;
	
	@Column(name="contact_person")
	private String contactPerson;
	
	@Column(name="head_office_address")
	private String headOfficeAddress;
	
	@Column(name="contact_number")
	private String contactNumber;
	
	@Column(name="organization_type")
	private OrganizationType type;
	
	
}
