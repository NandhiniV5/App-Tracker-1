package com.cts.app.tracker.apptracker;

public class WelcomeResponse {
private final String username;


public WelcomeResponse(String loggedinUsername) {
	this.username=loggedinUsername;
}


public String getUsername() {
	return username;
}
}
