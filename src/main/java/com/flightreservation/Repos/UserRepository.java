package com.flightreservation.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightreservation.Entities.User;

/*
 * ctrl + d for delete
 * 
 * copt paste for multiple
 * 
 * */

public interface UserRepository extends JpaRepository<User, Long> {

}
