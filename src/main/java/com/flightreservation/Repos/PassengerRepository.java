package com.flightreservation.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.Entities.Flight;
import com.flightreservation.Entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
