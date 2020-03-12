package com.unicodez.hrs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unicodez.hrs.entity.Guests;

public interface GuestsDao extends JpaRepository<Guests, Integer> { 

}
