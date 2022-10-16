package com.flightreservation.Repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flightreservation.Entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query("from Flight where departureCity = :deparCity and arrivalCity =:arriCity and dateOfDeparture =:deptDate")
	List<Flight> findFlights(@Param("arriCity") String to,
			@Param("deparCity") String from,
			@Param("deptDate") Date departureDate);

}
