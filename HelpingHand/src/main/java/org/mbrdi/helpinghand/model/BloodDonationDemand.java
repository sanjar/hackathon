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
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBloodGroupRequested() {
		return bloodGroupRequested;
	}

	public void setBloodGroupRequested(String bloodGroupRequested) {
		this.bloodGroupRequested = bloodGroupRequested;
	}

	public String getRequetorName() {
		return requetorName;
	}

	public void setRequetorName(String requetorName) {
		this.requetorName = requetorName;
	}

	

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getReasonForRequest() {
		return reasonForRequest;
	}

	public void setReasonForRequest(String reasonForRequest) {
		this.reasonForRequest = reasonForRequest;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Column(name="blood_group_requested")
	private String bloodGroupRequested;
	
	@Column(name="requestor_name")
	private String requetorName;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="contact_number")
	private String contactNumber;
	
	@Column(name="contact_name")
	private String contactName;
	
	@Column(name="reason_for_request")
	private String reasonForRequest;
	
	@Column(name="comment")
	private String comment;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
