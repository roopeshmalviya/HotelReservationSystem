package com.unicodez.hrs.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.unicodez.hrs.dao.GuestsDao;
import com.unicodez.hrs.entity.Guests;

@RestController
public class GuestsController {
	
	@PostMapping("/createGuest")
	@ResponseBody
	public Guests createGuest(@RequestBody Guests guest) {
		return guestsDao.save(guest);
	}
	
	@PutMapping("/updateGuest")
	public Guests updateGuest(@RequestBody Guests guests) {
		
		return guestsDao.save(guests);
	}
	
	@GetMapping("/allGuest")
	public List<Guests> getAllGuest() {
		return guestsDao.findAll();
	}
	
	@GetMapping("/guest")
	public Optional<Guests> guestById(@RequestParam("id") Integer id) {
		return guestsDao.findById(id);
	}
	
	
	@DeleteMapping("/deleteGuest")
	public void deleteById(@RequestParam("id") Integer id) {
		guestsDao.deleteById(id);
	}
	
	@Autowired
	GuestsDao guestsDao;

}
