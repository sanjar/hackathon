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
	
	@Column(name="donar_name")
	private String donarName;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="donation_date")
	private String donationDate;
	
	
}
