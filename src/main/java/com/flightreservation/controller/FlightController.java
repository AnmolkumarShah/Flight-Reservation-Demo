package com.flightreservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservation.Entities.Flight;
import com.flightreservation.Repos.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	FlightRepository theFlightRepository;

	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("to") String to, 
			@RequestParam("from") String from,
			@RequestParam("departueDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,
			Model m) {
		List<Flight> flightList = theFlightRepository.findFlights(to,from,departureDate);
		m.addAttribute("flights", flightList);
		return "displayFlights";
	}

}
