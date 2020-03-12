package com.unicodez.hrs.dto;

import com.unicodez.hrs.entity.Guests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class GuestsDto {
	
	public Guests guests;

	public Guests getGuests() {
		return guests;
	}

	public void setGuests(Guests guests) {
		this.guests = guests;
	}

	@Override
	public String toString() {
		return "GuestsDto [guests=" + guests + "]";
	}	

}
