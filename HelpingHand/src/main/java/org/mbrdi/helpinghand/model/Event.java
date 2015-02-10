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
	
	@Column(name="event_type")
	private String eventType;
	
	
	
	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public String getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(String eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public String getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(String eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public Contact getContactDetail() {
		return contactDetail;
	}

	public void setContactDetail(Contact contactDetail) {
		this.contactDetail = contactDetail;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	
	
}
