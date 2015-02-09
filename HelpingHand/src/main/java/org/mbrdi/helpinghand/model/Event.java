package org.mbrdi.helpinghand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="helping_hand_event")
public class Event {

	@Id
	@GeneratedValue
	@Column(name="event_id")
	private Integer eventId;
	
	@Column(name="event_name")
	private String eventName;
	
	@Column(name="event_description")
	private String eventDescription;
	
	@Column(name="event_start_date")
	private String eventStartDate;
	
	@Column(name="event_end_date")
	private String eventEndDate;
	
	@Column(name="event_location")
	private String eventLocation;
	
	@ManyToOne
	@JoinColumn(name="contact_id")
	private Contact contactDetail;
	
}
