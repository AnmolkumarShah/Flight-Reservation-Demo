package com.flightreservation.Service;

import com.flightreservation.Entities.User;

public interface UserService {
	
	User save(User user);
	
	User findByEmail(String email);

}
