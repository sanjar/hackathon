package org.mbrdi.helpinghand.pdf;

public class PDFReciept {
	private String title;
	private String eventName;
	private String dateOfRecieptGeneration;
	private String nameOfPerson;
	private String detailsOfEntry;
	private float donationAmount;
	private String pathOfSignature;
	private String nameOfSignatory;

	public PDFReciept(String title, String eventName,String dateOfRecieptGeneration, 
			String nameOfPerson, String detailsOFEntry,float donationAmount, 
			String pathOfSignature,String nameOfSignatory) {
		this.title = title;
		this.eventName = eventName;
		this.dateOfRecieptGeneration = dateOfRecieptGeneration;
		this.nameOfPerson = nameOfPerson;
		this.detailsOfEntry = detailsOFEntry;
		this.donationAmount = donationAmount;
		this.pathOfSignature=pathOfSignature;
		this.nameOfSignatory = nameOfSignatory;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEventName() {
		return eventName;
	}
	
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	public String getDateOfReciept(){
		return this.dateOfRecieptGeneration;
	}
	
	public void setDateOfReciept(String dateOfRecieptGeneration){
		this.dateOfRecieptGeneration =dateOfRecieptGeneration;
	}

	public String getNameOfDonator() {
		return nameOfPerson;
	}

	public void setNameOfDonator(String isbn) {
		this.nameOfPerson = isbn;
	}
	
	public String getdetailsOfEntry(){
		return this.detailsOfEntry;
	}
	public void setdetailsOfEntry(String detailsOfEntry){
		this.detailsOfEntry = detailsOfEntry;
	}
	public float getDonationAmount() {
		return this.donationAmount;
	}

	public void setDonationAmount(float donationAmount) {
		this.donationAmount = donationAmount;
	}
	
	public String getSignatureImage(){
		return this.pathOfSignature;
	}
	
	public void setSignatureImage(String pathOfSignature ){
		this.pathOfSignature=pathOfSignature;
	}
	
	public void setNameOFSignatory(String nameOfSignatory ){
	this.nameOfSignatory = nameOfSignatory;
	}
	public String getNameOfSignatory(){
		return this.nameOfSignatory;
	}
}