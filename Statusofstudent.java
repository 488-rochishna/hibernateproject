package com.hexaware.onlineadm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Statusofstudent")

public class Statusofstudent {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "upload_Documents")
	 private String upload_Documents;
	 @Column(name = "Payment")
	 private int Payment;
	 public Statusofstudent() {
	 }
	 public Statusofstudent(String upload_Documents) {
		 this.upload_Documents = upload_Documents;
		  }
	 
		 public String getupload_Documents() {
		 return upload_Documents;
		 }
		 public void setupload_Documents(String upload_Documents) {
		 this.upload_Documents = upload_Documents;
		 }
		 public void setPayment(int Payment) {
			 this.Payment = Payment;
			 }
		 @Override
		 public String toString() {
		 return " Statusofstudent[upload_Documents=" + upload_Documents + ",Payment=" + Payment + "]";
		 }

}
