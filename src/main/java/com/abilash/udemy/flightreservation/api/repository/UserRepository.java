package com.abilash.udemy.flightreservation.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abilash.udemy.flightreservation.api.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
