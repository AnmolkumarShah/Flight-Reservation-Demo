package com.flightreservation.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightreservation.Entities.Flight;
import com.flightreservation.Entities.Passenger;
import com.flightreservation.Entities.Reservation;
import com.flightreservation.Repos.FlightRepository;
import com.flightreservation.Repos.PassengerRepository;
import com.flightreservation.Repos.ReservationRepository;
import com.flightreservation.dto.ResrvationRequest;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	PassengerRepository thePassengerRepository;
	
	@Autowired
	FlightRepository theFlightRepository;
	
	@Autowired
	ReservationRepository theReservationRepository;

	@Override
	public Reservation bookFlight(ResrvationRequest request) {
		
		// make payment
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = theFlightRepository.findById(flightId);
		Flight theFlight = findById.get();
		
		
		Passenger thePassenger = new Passenger();
		thePassenger.setFirstName(request.getFirstName());
		thePassenger.setLastName(request.getLastName());
		thePassenger.setEmail(request.getEmail());
		thePassenger.setMiddleName(request.getLastName());
		thePassenger.setPhone(request.getPhone());
		
		Passenger savedPassenger = thePassengerRepository.save(thePassenger);
		
		Reservation theReservation = new Reservation();
		theReservation.setFlight(theFlight);
		theReservation.setPassenger(savedPassenger);
		theReservation.setCheckedIn(false);
		
		Reservation save = theReservationRepository.save(theReservation);
		
		return save;
	}
	
}
