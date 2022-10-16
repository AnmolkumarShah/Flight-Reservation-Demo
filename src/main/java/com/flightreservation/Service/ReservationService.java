package com.flightreservation.Service;

import com.flightreservation.Entities.Reservation;
import com.flightreservation.dto.ResrvationRequest;

public interface ReservationService {
	
	Reservation bookFlight(ResrvationRequest request);

}
