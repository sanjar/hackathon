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
	
	@Column(name="receipt_amount")
	private String receiptAmount;
	
	@Column(name="receipt_for")
	private String receiptFor;
	
	@Column(name="receipt_signed_by")
	private String receiptSignedBy;
}
