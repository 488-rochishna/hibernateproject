package com.hexaware.onlineadm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Course")

public class Course {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "course_id")
	 private int course_id;
	 @Column(name = "course_Name")
	 private String course_Name;
	 public Course() {
	 }
	 public Course(String course_Name) {
		 this.course_Name = course_Name;
		  }
	 public void setcourse_id(int course_id) {
		 this.course_id = course_id;
		 }
		 public String getcourse_Name() {
		 return course_Name;
		 }
		 public void setcourse_Name(String course_Name) {
		 this.course_Name = course_Name;
		 }
		 @Override
		 public String toString() {
		 return "Course [course_id=" + course_id + ", course_Name=" + course_Name + "]";
		 }
       

}
