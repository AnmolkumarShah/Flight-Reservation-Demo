package com.flightreservation.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.Entities.User;

public interface FlightRepository extends JpaRepository<User, Long> {

}
