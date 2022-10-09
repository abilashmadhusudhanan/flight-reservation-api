package com.abilash.udemy.flightreservation.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abilash.udemy.flightreservation.api.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
