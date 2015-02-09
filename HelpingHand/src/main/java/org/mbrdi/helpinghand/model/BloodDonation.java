package org.mbrdi.helpinghand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="helping_hand_blood_donation")
public class BloodDonation {

	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="donar_id")
	private Donar donar;
	
	
	@Column(name="donation_date")
	private String donationDate;
		
	@Column(name="donation_address")
	private String donationAddress;
	
}
