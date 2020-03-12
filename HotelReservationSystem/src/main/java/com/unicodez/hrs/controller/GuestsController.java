package com.unicodez.hrs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.unicodez.hrs.dao.GuestsDao;
import com.unicodez.hrs.entity.Guests;

@Controller
public class GuestsController {
	
	@PostMapping("/createGuest")
	@ResponseBody
	public Guests createGuest() {
		
		Guests guest = new Guests();
		
		guest.setgFirstName("Devi");
		guest.setgMiddleName("Lal");
		guest.setgLastName("Singh");
		guest.setgAddress("12, Pipal Chauraha");
		guest.setgCity("Indore");
		guest.setgState("MP");
		guest.setgEmail("ajaylalsingh@gmail.com");
		guest.setgMobileNo("882-343-1457");
		guest.setgHomePhoneNo("323-432-6784");
		guest.setgGender("Male");
		guest.setgCountry("India");
		guest.setgZipCode("47594");
		return guestsDao.save(guest);
	}
//	@GetMapping("/getGuest")
//	public Optional<Guests> guestById() {
//		return guestsDao.findById(1);
//	}
	
	@Autowired
	GuestsDao guestsDao;

}
