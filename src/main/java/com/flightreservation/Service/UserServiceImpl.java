package com.flightreservation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightreservation.Entities.User;
import com.flightreservation.Repos.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository theUserRepository;

	@Override
	public User save(User user) {
		return theUserRepository.save(user);
	}

	@Override
	public User findByEmail(String email) {
		return theUserRepository.findByEmail(email);
	}

}
