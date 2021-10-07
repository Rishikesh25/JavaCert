package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //marks entity to be mapped in DB
@Table(name="student_data1") //marks table name where  class objects are to be stored


public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Roll_No")
      private int roll_no;
	
	@Column(name="First_name")
      private String first_name;
	
	@Column(name="Last_name")
      private String last_name;
	
	@Column(name="grade")
      private int grade;
      
      public Student() {}
      
      public Student(String first_name, String last_name, int grade )
      {  this.first_name =first_name;
         this.last_name=last_name;
         this.grade=grade;
 	  
      }

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
}
