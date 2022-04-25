package com.hexaware.onlineadm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Administrator")

public class Administrator {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "admin_id")
	 private int admin_id;
	 @Column(name = "admin_Name")
	 private String admin_Name;
	 public Administrator() {
	 }
	 public Administrator(String admin_Name) {
		 this.admin_Name = admin_Name;
		  }
	 public void setadmin_id(int admin_id) {
		 this.admin_id = admin_id;
		 }
		 public String getadmin_Name() {
		 return admin_Name;
		 }
		 public void setadmin_Name(String admin_Name) {
		 this.admin_Name = admin_Name;
		 }
		 @Override
		 public String toString() {
		 return "Administrator [admin_id=" + admin_id + ", admin_Name=" + admin_Name + "]";
		 }
       

}
