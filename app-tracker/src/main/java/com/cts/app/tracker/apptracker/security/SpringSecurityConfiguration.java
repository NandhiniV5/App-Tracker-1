package com.cts.app.tracker.apptracker.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
	//InMemoryUserDetailsManager()
	
	
	@Bean
	
	public InMemoryUserDetailsManager createUserDetailsManager() {
		//whatever input comes in the password encoder will encode it 
		UserDetails userDetails1 = createNewUser("nandhu", "nandhu@18");
		UserDetails userDetails2 = createNewUser("radhika", "radhika23");
		UserDetails userDetails3 = createNewUser("giftson", "giftson");
		
		return new InMemoryUserDetailsManager(userDetails1,userDetails2,userDetails3);
	}

	private UserDetails createNewUser(String userName, String password) {
		Function<String, String> passwordEncoder
		=input -> passwordEncoder().encode(input);
		
		UserDetails userDetails = User.builder()
				.passwordEncoder(passwordEncoder)
		.username(userName)
		.password(password)
		.roles("USER","ADMIN")
		.build();
		return userDetails;
	}

	/*
	 * protected void configure(AuthenticationManagerBuilder auth) throws Exception
	 * {
	 * auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder()
	 * ); }
	 */
@Bean
	
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
