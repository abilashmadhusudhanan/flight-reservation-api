package com.abilash.udemy.flightreservation.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abilash.udemy.flightreservation.api.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
