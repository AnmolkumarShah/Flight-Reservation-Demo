package com.flightreservation.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.Entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
