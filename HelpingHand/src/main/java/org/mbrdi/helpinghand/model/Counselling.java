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
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CounsellingType getType() {
		return type;
	}

	public void setType(CounsellingType type) {
		this.type = type;
	}

	public String getCounsellingDate() {
		return counsellingDate;
	}

	public void setCounsellingDate(String counsellingDate) {
		this.counsellingDate = counsellingDate;
	}

	public Contact getConatct() {
		return conatct;
	}

	public void setConatct(Contact conatct) {
		this.conatct = conatct;
	}

	@Column(name="counselling_type")
	private CounsellingType type;
	
	@Column(name="counselling_date")
	private String counsellingDate;
	
	@ManyToOne
	@JoinColumn(name="contact_id")
	private Contact conatct;
}
