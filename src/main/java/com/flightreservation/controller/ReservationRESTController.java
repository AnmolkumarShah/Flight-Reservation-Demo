package com.flightreservation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightreservation.Entities.Reservation;
import com.flightreservation.Repos.ReservationRepository;
import com.flightreservation.dto.ReservationUpdateRequest;

@RestController
@RequestMapping("/rest")
public class ReservationRESTController {
	@Autowired
	private ReservationRepository theReservationRepository;
	
	@RequestMapping("reservations/{id}")
	public Reservation getReservation(@PathVariable("id") long id) {
		Optional<Reservation> findById = theReservationRepository.findById(id);
		Reservation theReservation = findById.get();
		if(theReservation == null) return null;
		return theReservation;
	}
	
	@PostMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Reservation theReservation = getReservation(request.getId());
		theReservation.setCheckedIn(request.getCheckedIn());
		theReservation.setNumberOfBags(request.getNumberOfBags());
		
		Reservation saved = theReservationRepository.save(theReservation);
		return saved;
	}
	
}
