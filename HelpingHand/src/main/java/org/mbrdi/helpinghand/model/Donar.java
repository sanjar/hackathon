package org.mbrdi.helpinghand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="helping_hand_donar")
public class Donar {

	@Id
	@GeneratedValue
	@Column(name="donar_id")
	private Integer donarId;
	
	public Integer getDonarId() {
		return donarId;
	}

	public void setDonarId(Integer donarId) {
		this.donarId = donarId;
	}

	public String getDonarName() {
		return donarName;
	}

	public void setDonarName(String donarName) {
		this.donarName = donarName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}

	@Column(name="donar_name")
	private String donarName;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="donation_date")
	private String donationDate;
	
	@Column(name="donar_email")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
