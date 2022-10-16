package com.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.flightreservation.Entities.User;
import com.flightreservation.Service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService theSerUserService;

	@RequestMapping("/reguser")
	public String registerUser(Model m) {
		m.addAttribute("newUser", new User());
		return "login/registerUser";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute("newUser") User theUser) {
		User savedUser = theSerUserService.save(theUser);
		return "login/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, 
			@RequestParam("password") String password, Model m) {
		User u = theSerUserService.findByEmail(email);
		if(u.getPassword().equals(password)) {			
			return "/findFlights";
		}else {
			m.addAttribute("msg", "invalid email or password");
			return "login/login";
		}
	}

}
