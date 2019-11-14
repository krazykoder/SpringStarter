package com.towshif.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.towshif.service.WelcomeService;

@RestController
public class WelcomeController {

//	Dependency Injection
//	private WelcomeService service = new WelcomeService();

//	 Inject Here => AutoWiring
	@Autowired
	private WelcomeService service;
	
	@RequestMapping("/")
	public String InitialPage() {
		return "<strong>Hello this is my web service.</strong>"
				+ "<br>"
				+ "<a href='welcome'>Welcome</a>";
//		 return "Welcome! This is the first View. Towshif is here.";
	}
	
//	 welcome message
	@RequestMapping("/welcome")
	public String welcome() {
		return service.retrieveWelcomeMessageByTime();
//		 return "Welcome! This is the first View. Towshif is here.";
	}
}

