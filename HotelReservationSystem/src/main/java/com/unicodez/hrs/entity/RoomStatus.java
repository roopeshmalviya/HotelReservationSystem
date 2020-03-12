package com.unicodez.hrs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RoomStatus")
public class RoomStatus {
	
	@Id
	private Integer rStatusId;
	private String rStatusName;
	
	public RoomStatus() {
		super();
	}
	
	public RoomStatus(Integer rStatusId, String rStatusName) {
		super();
		this.rStatusId = rStatusId;
		this.rStatusName = rStatusName;
	}
	public Integer getrStatusId() {
		return rStatusId;
	}
	public void setrStatusId(Integer rStatusId) {
		this.rStatusId = rStatusId;
	}
	public String getrStatusName() {
		return rStatusName;
	}
	public void setrStatusName(String rStatusName) {
		this.rStatusName = rStatusName;
	}
	
}
