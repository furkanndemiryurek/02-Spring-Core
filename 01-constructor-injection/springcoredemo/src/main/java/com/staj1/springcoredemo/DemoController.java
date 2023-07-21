package com.staj1.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	Coach theCoach;

	@Autowired
	public DemoController(Coach theCoach) {
		super();
		this.theCoach = theCoach;
	}
	
	@GetMapping("/getDailyWorkout")
	public String dailyWorkout() {
		return theCoach.getDailyWorkout();
	}
}
