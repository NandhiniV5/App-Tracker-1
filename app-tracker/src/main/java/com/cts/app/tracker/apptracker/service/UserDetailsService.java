package com.cts.app.tracker.apptracker.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface UserDetailsService{
	
	/*
	 * private final AppTrackerRepository appTrackerRepository;
	 *
	 * @Autowired public userDetailService(AppTrackerRepository
	 * appTrackerRepository) {
	 * 
	 * this.appTrackerRepository = appTrackerRepository; }
	 */
	public UserDetails findByUserName(String userName);
	
}
