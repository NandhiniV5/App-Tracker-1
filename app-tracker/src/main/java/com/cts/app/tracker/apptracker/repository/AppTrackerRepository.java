package com.cts.app.tracker.apptracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.app.tracker.apptracker.entity.UserDetails;

@Repository 
public interface AppTrackerRepository extends JpaRepository<UserDetails,Long>{

	//org.springframework.security.core.userdetails.UserDetails findByUserName(String userName);

	//UserDetails userDetails findByUserName(String userName);

	
}
