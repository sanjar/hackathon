package org.mbrdi.helpinghand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="helping_hand_counselling")
public class Counselling {

	@Id
	@GeneratedValue
	@Column(name="counselling_id")
	private Integer id;
	
	@Column(name="counselling_type")
	private CounsellingType type;
	
	@Column(name="counselling_date")
	private String counsellingDate;
	
	@ManyToOne
	@JoinColumn(name="contact_id")
	private Contact conatct;
}
