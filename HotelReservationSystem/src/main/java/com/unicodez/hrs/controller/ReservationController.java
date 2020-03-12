//package com.unicodez.hrs.controller;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.unicodez.hrs.dao.GuestsDao;
//import com.unicodez.hrs.dao.ReservationDao;
//import com.unicodez.hrs.entity.Guests;
//import com.unicodez.hrs.entity.Reservation;
//
//@RestController
//public class ReservationController {
//	
//	@RequestMapping("doReserve")
//	public Reservation doReserve() {
//		Reservation reservation = new Reservation();
//		Optional<Guests> guests = guestsDao.findById(1);
//		
//		
//		return reservationDao.save(reservation);
//	}
//	@Autowired
//	ReservationDao reservationDao;
//	
//	@Autowired
//	GuestsDao guestsDao;
//}
