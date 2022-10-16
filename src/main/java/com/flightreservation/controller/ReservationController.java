package com.flightreservation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservation.Entities.Flight;
import com.flightreservation.Entities.Reservation;
import com.flightreservation.Repos.FlightRepository;
import com.flightreservation.Service.ReservationService;
import com.flightreservation.dto.ResrvationRequest;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository theFlightRepository;

	@Autowired
	ReservationService theReservationService;

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") long id, Model m) {
		Optional<Flight> flightOptional = theFlightRepository.findById(id);
		Flight flight = flightOptional.get();
		m.addAttribute("flight", flight);
		return "completeReservation";
	}

	@RequestMapping("/completeReservation")
	public String completeReservation(ResrvationRequest request, Model m) {
		System.out.println(request);

		Reservation bookFlight = theReservationService.bookFlight(request);
		String msg = "Reservation created successfullt with id " + bookFlight.getId();
		m.addAttribute("msg", msg);

		return "reservationConfirmation";
	}

}
