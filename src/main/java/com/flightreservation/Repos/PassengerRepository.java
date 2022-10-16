package com.flightreservation.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.Entities.Flight;

public interface PassengerRepository extends JpaRepository<Flight, Long> {

}
