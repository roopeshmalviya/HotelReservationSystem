//package com.unicodez.hrs.entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "Room")
//public class Room {
//
//	@Id
//	private Integer roomId;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "rrt_fk", referencedColumnName = "roomTypeId")
//	private RoomType roomTypeId;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "rrs_fk", referencedColumnName = "roomTypeId")
//	private RoomStatus roomStatus;
//	
//	public Room() {
//		super();
//	}
//
//	public Integer getRoomId() {
//		return roomId;
//	}
//	public void setRoomId(Integer roomId) {
//		this.roomId = roomId;
//	}
//	public RoomType getRoomTypeId() {
//		return roomTypeId;
//	}
//	public void setRoomTypeId(RoomType roomTypeId) {
//		this.roomTypeId = roomTypeId;
//	}
//	public RoomStatus getRoomStatus() {
//		return roomStatus;
//	}
//	public void setRoomStatus(RoomStatus roomStatus) {
//		this.roomStatus = roomStatus;
//	}
//		
//}