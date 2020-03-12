package com.unicodez.hrs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicodez.hrs.dao.RoomStatusDao;
import com.unicodez.hrs.dao.RoomTypeDao;
import com.unicodez.hrs.entity.RoomStatus;
import com.unicodez.hrs.entity.RoomType;

@RestController
public class MasterController {
	
	@PostMapping("/createRoomType")
	public RoomType createRoomType() {
		RoomType rt = new RoomType();
		rt.setRoomTypeId(103);
		rt.setRoomTypeName("Family");
		
		return roomTypeDao.save(rt);
				
	}
	
	@PostMapping("/createRoomStatus")
	public RoomStatus createRoomStatus() {
		RoomStatus roomStatus = new RoomStatus();
		roomStatus.setrStatusId(0);
		roomStatus.setrStatusName("Booked");
		
		return roomStatusDao.save(roomStatus);
	}
	
	
	@Autowired
	RoomTypeDao roomTypeDao;

	@Autowired
	RoomStatusDao roomStatusDao;
	

	
	
}
