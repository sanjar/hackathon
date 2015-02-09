package org.mbrdi.helpinghand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="helping_hand_donation")
public class Donation {

	@Id
	@GeneratedValue
	@Column(name="donation_id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="amount")
	private String amount;
	
	@Column(name="description")
	private String description;
	
	@Column(name="type")
	private DonationType type;
	
	@ManyToOne
	@JoinColumn(name="organization_id")
	private Organization organization;
	
}
