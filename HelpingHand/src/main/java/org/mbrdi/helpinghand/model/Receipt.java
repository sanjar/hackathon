package org.mbrdi.helpinghand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="helping_hand_receipt")
public class Receipt {

	@Id
	@GeneratedValue
	@Column(name="receipt_id")
	private Integer receiptId;
	
	@Column(name="receipt_date")
	private String receiptDate;
	
	@Column(name="receipt_provided_by")
	private String receiptProvidedBy;
	
	@Column(name="receipt_provided_to")
	private String receiptProvidedTo;
	
	public Integer getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(Integer receiptId) {
		this.receiptId = receiptId;
	}

	public String getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}

	public String getReceiptProvidedBy() {
		return receiptProvidedBy;
	}

	public void setReceiptProvidedBy(String receiptProvidedBy) {
		this.receiptProvidedBy = receiptProvidedBy;
	}

	public String getReceiptProvidedTo() {
		return receiptProvidedTo;
	}

	public void setReceiptProvidedTo(String receiptProvidedTo) {
		this.receiptProvidedTo = receiptProvidedTo;
	}

	public String getReceiptAmount() {
		return receiptAmount;
	}

	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getReceiptFor() {
		return receiptFor;
	}

	public void setReceiptFor(String receiptFor) {
		this.receiptFor = receiptFor;
	}

	public String getReceiptSignedBy() {
		return receiptSignedBy;
	}

	public void setReceiptSignedBy(String receiptSignedBy) {
		this.receiptSignedBy = receiptSignedBy;
	}

	@Column(name="receipt_amount")
	private String receiptAmount;
	
	@Column(name="receipt_for")
	private String receiptFor;
	
	@Column(name="receipt_signed_by")
	private String receiptSignedBy;
}
