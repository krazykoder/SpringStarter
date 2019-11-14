package com.towshif.service;

import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	public String retrieveWelcomeMessageByTime() {

		// TODO: add a complex logic based on time in the day to welcome
		String defaultMessage = "This is a great time. "; 
		String message = "Welcome!";
		Calendar c = Calendar.getInstance();
		int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

		if (timeOfDay >= 0 && timeOfDay < 12) {
			message =  "Good Morning"; 
		} else if (timeOfDay >= 12 && timeOfDay < 16) {
			message =  "Good Afternoon !"; 
		} else if (timeOfDay >= 16 && timeOfDay < 21) {
			message =  "Good Evening"; 
		} else if (timeOfDay >= 21 && timeOfDay < 24) {
			message =  "Good Night ! "; 
		}
		
		return defaultMessage +  message;
	}
}