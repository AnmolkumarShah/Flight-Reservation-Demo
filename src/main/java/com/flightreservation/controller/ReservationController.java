package com.flightreservation.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservation.Entities.Flight;
import com.flightreservation.Repos.FlightRepository;

@Controller
public class ReservationController {

	@Autowired
	FlightRepository theFlightRepository;

	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") long id, Model m) {
		Optional<Flight> flightOptional = theFlightRepository.findById(id);
		Flight flight = flightOptional.get();
		m.addAttribute("flight", flight);
		return "completeReservation";
	}
	
	@RequestMapping("/completeReservation")
	public String completeReservation() {
		return null;
	}

}
