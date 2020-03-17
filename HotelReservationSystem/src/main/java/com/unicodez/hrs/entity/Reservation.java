///**
// * 
// */
//package com.unicodez.hrs.entity;
//
//import java.sql.Date;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
///**
// * @author The Rp
// *
// */
//@Entity
//@Table(name = "Reservation")
//public class Reservation {
//	
//	@Id
//	private Integer reservationId;
//	private Date checkInDate;
//	private Date checkOutDate;
//	private Integer adults;
//	private Integer children;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "rrt_fk", referencedColumnName = "roomTypeId")
//	private RoomType roomType;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "rrs_fk", referencedColumnName = "rStatusId")
//	private RoomStatus roomStatus;
//	
//	public Reservation() {
//		super();
//	}
//	
//	public Integer getReservationId() {
//		return reservationId;
//	}
//	public void setReservationId(Integer reservationId) {
//		this.reservationId = reservationId;
//	}
//	public Date getCheckInDate() {
//		return checkInDate;
//	}
//	public void setCheckInDate(Date checkInDate) {
//		this.checkInDate = checkInDate;
//	}
//	public Date getCheckOutDate() {
//		return checkOutDate;
//	}
//	public void setCheckOutDate(Date checkOutDate) {
//		this.checkOutDate = checkOutDate;
//	}
//	public Integer getAdults() {
//		return adults;
//	}
//	public void setAdults(Integer adults) {
//		this.adults = adults;
//	}
//	public Integer getChildren() {
//		return children;
//	}
//	public void setChildren(Integer children) {
//		this.children = children;
//	}
//
//	public RoomType getRoomType() {
//		return roomType;
//	}
//
//	public void setRoomType(RoomType roomType) {
//		this.roomType = roomType;
//	}
//
//	public RoomStatus getRoomStatus() {
//		return roomStatus;
//	}
//
//	public void setRoomStatus(RoomStatus roomStatus) {
//		this.roomStatus = roomStatus;
//	}
//
//	
//}
