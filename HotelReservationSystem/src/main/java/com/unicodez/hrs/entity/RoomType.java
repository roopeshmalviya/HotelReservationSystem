package com.unicodez.hrs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RoomType")
public class RoomType {
	@Id
	private Integer roomTypeId;
	private String roomTypeName;

	public RoomType() {
		super();
	}
	
	public RoomType(Integer roomTypeId, String roomTypeName) {
		super();
		this.roomTypeId = roomTypeId;
		this.roomTypeName = roomTypeName;
	}
	public Integer getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(Integer roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public String getRoomTypeName() {
		return roomTypeName;
	}
	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}
	
	

}
