package com.unicodez.hrs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Guests")
public class Guests {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer gId;
	private String gFirstName;
	private String gMiddleName;
	private String gLastName;
	private String gAddress;
	private String gCity;
	private String gState;
	private String gZipCode;
	private String gCountry;
	private String gMobileNo;
	private String gHomePhoneNo;
	private String gEmail;
	private String gGender;
	private String gPassword;
	
//	@OneToOne(targetEntity = Reservation.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "gr_fk", referencedColumnName = "reservationId")
//	private Reservation reservation;
	
	
	public Guests() {
		super();
	}
	public Integer getgId() {
		return gId;
	}
	public void setgId(Integer gId) {
		this.gId = gId;
	}
	public String getgFirstName() {
		return gFirstName;
	}
	public void setgFirstName(String gFirstName) {
		this.gFirstName = gFirstName;
	}
	public String getgMiddleName() {
		return gMiddleName;
	}
	public void setgMiddleName(String gMiddleName) {
		this.gMiddleName = gMiddleName;
	}
	public String getgLastName() {
		return gLastName;
	}
	public void setgLastName(String gLastName) {
		this.gLastName = gLastName;
	}
	public String getgAddress() {
		return gAddress;
	}
	public void setgAddress(String gAddress) {
		this.gAddress = gAddress;
	}
	public String getgCity() {
		return gCity;
	}
	public void setgCity(String gCity) {
		this.gCity = gCity;
	}
	public String getgState() {
		return gState;
	}
	public void setgState(String gState) {
		this.gState = gState;
	}
	public String getgZipCode() {
		return gZipCode;
	}
	public void setgZipCode(String gZipCode) {
		this.gZipCode = gZipCode;
	}
	public String getgCountry() {
		return gCountry;
	}
	public void setgCountry(String gCountry) {
		this.gCountry = gCountry;
	}
	public String getgMobileNo() {
		return gMobileNo;
	}
	public void setgMobileNo(String gMobileNo) {
		this.gMobileNo = gMobileNo;
	}
	public String getgHomePhoneNo() {
		return gHomePhoneNo;
	}
	public void setgHomePhoneNo(String gHomePhoneNo) {
		this.gHomePhoneNo = gHomePhoneNo;
	}
	public String getgEmail() {
		return gEmail;
	}
	public void setgEmail(String gEmail) {
		this.gEmail = gEmail;
	}
	public String getgGender() {
		return gGender;
	}
	public void setgGender(String gGender) {
		this.gGender = gGender;
	}
	public String getgPassword() {
		return gPassword;
	}
	public void setgPassword(String gPassword) {
		this.gPassword = gPassword;
	}
	
	
//	public Reservation getReservation() {
//		return reservation;
//	}
//	public void setReservation(Reservation reservation) {
//		this.reservation = reservation;
//	}
		
}
