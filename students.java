package com.hexaware.onlineadm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")

public class students {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "stu_id")
	 private int stu_id;
	 @Column(name = "stu_Name")
	 private String stu_Name;
	 @Column(name = "stu_Age")
	 private int stu_Age;
	 @Column(name = "Gender")
	 private String Gender;
	 @Column(name = "email")
	 private String email;
	 @Column(name = "Mobileno")
	 private String Mobileno;
	 @Column(name = "stu_Address")
	 private String stu_Address;
	 @Column(name = "stu_Percentage")
	 private int stu_Percentage;
	 public students() {
	 }
	 public students(String stu_Name, String Gender, String email, String Mobileno, String stu_Address) {
	 this.stu_Name = stu_Name;
	 this.Gender = Gender;
	 this.email = email;
	 this.Mobileno = Mobileno;
	 this.stu_Address = stu_Address;
	 }
	 public void setstu_id(int stu_id) {
		 this.stu_id = stu_id;
		 }
		 public String getstu_Name() {
		 return stu_Name;
		 }
		 public void setstu_Name(String stu_Name) {
		 this.stu_Name = stu_Name;
		 }
		 public void setstu_Age(int stu_Age) {
		 this.stu_Age = stu_Age;
		 }
		 public String getGender() {
		 return Gender;
		 }
		 public void setGender(String Gender) {
		 this.Gender = Gender;
		 }
		 public String getemail() {
		 return email;
		 }
		 public void setemail(String email) {
		 this.email = email;
		 }
		 public String getMobileno() {
		 return Mobileno;
		 }
		 public void setMobileno(String Mobileno) {
		 this.Mobileno = Mobileno;
		 }
		 public String stu_Address() {
		 return stu_Address;
		 }
		 public void setstu_Address(String stu_Address) {
		 this.stu_Address = stu_Address;
		 }
		 public void stu_Percentage(int stu_Percentage) {
		 this.stu_Percentage = stu_Percentage;
		 }
		 @Override
		 public String toString() {
		 return "students [stu_id=" + stu_id + ", stu_Name=" + stu_Name + ", stu_Age=" + stu_Age + ", Gender=" + Gender + ", email=" + email + ",Mobileno=" + Mobileno + ",stu_Address=" + stu_Address + ",stu_Percentage=" + stu_Percentage + "]";
		 }
		 
	 
	

}
