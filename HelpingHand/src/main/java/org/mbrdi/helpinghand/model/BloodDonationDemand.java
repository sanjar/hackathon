package org.mbrdi.helpinghand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="helping_hand_blood_donation_demand")
public class BloodDonationDemand {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@Column(name="blood_group_requested")
	private String bloodGroupRequested;
	
	@Column(name="requestor_name")
	private String requetorName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contact_number")
	private String contactNumber;
	
	@Column(name="contact_name")
	private String contactName;
	
	@Column(name="reason_for_request")
	private String reasonForRequest;
	
	@Column(name="comment")
	private String comment;
}
