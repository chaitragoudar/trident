package com.example.demo.entity;

public class ResponseVO {
	
	private Passport passport;
	private Person person;
	
	public ResponseVO() {
		
	}
	
	public ResponseVO(Passport passport, Person person) {
		super();
		this.passport = passport;
		this.person = person;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "ResponseVO [passport=" + passport + ", person=" + person + "]";
	}
	
	

}
