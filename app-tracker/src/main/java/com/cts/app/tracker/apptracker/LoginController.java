package com.cts.app.tracker.apptracker;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/")
public class LoginController {
	//public LoginController(AppTrackerRepository appTrackerRepository)
	@GetMapping
	public WelcomeResponse welcome() {
		return new WelcomeResponse(getLoggedinUsername());
		
	}
	private String getLoggedinUsername() {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		
		return authentication.getName();
	}
	/*
	 * public LoginController(AppTrackerRepository appTrackerRepository) { super();
	 * this.appTrackerRepository = appTrackerRepository; // TODO Auto-generated
	 * constructor stub } private AppTrackerRepository appTrackerRepository;
	 * 
	 * @Autowired userDetailService userDetailService;
	 */
		/*
		 * @Autowired userDetails userDetails;
		 */
	 
	
		/*
		 * @RequestMapping(value="/",method = RequestMethod.GET) public String
		 * gotoWelcomePage(ModelMap model) { model.put("name", getLoggedinUsername());
		 * return "welcome"; }
		 */
	 
	
	
}