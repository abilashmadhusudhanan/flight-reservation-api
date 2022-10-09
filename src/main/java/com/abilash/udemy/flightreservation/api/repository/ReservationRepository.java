package com.abilash.udemy.flightreservation.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abilash.udemy.flightreservation.api.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
