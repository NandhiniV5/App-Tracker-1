
/* package com.cts.app.tracker.apptracker;
  
  import org.springframework.beans.factory.annotation.Autowired;
import
  org.springframework.http.HttpStatus;
import
  org.springframework.http.ResponseEntity;
import
  org.springframework.security.crypto.password.PasswordEncoder;
import
  org.springframework.web.bind.annotation.PostMapping;
import
  org.springframework.web.bind.annotation.RequestBody;
import
  org.springframework.web.bind.annotation.RequestMapping;
import
  org.springframework.web.bind.annotation.RestController;

import com.cts.app.tracker.apptracker.dto.UserDto;
import
  com.cts.app.tracker.apptracker.entity.UserDetails;
import
  com.cts.app.tracker.apptracker.repository.AppTrackerRepository;
import com.cts.app.tracker.apptracker.service.UserDetailsServiceImpl;
  
  @RestController
 
  @RequestMapping("/registration") 
  public class RegistrationController {
  
  @Autowired 
  private AppTrackerRepository appTrackerRepository;
  
  @Autowired
  private UserDetailsServiceImpl userDetailsServiceImpl;
  @Autowired 
  private PasswordEncoder passwordEncoder;
  
  @PostMapping
  public ResponseEntity<String> registerUser(@RequestBody UserDto
  userDto) { 
	  System.out.println("nandhu userdto");
	  UserDetails existingUser =(UserDetails) userDetailsServiceImpl.findByUserName(userDto.getUserName()); 
	  if (existingUser!= null) { 
		  return new ResponseEntity<>("Username already exists",HttpStatus.BAD_REQUEST); 
		  }
  
  UserDetails user = new UserDetails();
  user.setUserName(userDto.getUserName());
  user.setPasswordhash(passwordEncoder.encode(userDto.getPassword()));
  user.setEmail(userDto.getEmail());
  appTrackerRepository.save(user);
  
  return new ResponseEntity<>("User registered successfully", HttpStatus.OK); }
  }
 */