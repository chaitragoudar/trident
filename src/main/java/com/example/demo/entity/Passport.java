package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fname;
	private String lname;
	private String adharNo;
	
	public Passport() {
		
	}
	public Passport(int id, String fname, String lname, String adharNo) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.adharNo = adharNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	@Override
	public String toString() {
		return "Passport [id=" + id + ", fname=" + fname + ", lname=" + lname + ", adharNo=" + adharNo + "]";
	}
	
	

}
