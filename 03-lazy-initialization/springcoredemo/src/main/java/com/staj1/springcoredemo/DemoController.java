package com.staj1.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	Coach theCoach;

	@Autowired
	public DemoController(@Qualifier("swimCoach")Coach theCoach) {
		super();
		this.theCoach = theCoach;
	}
	
	@GetMapping("/getDailyWorkout")
	public String dailyWorkout() {
		System.out.println(" -> " + getClass().getSimpleName());
		return theCoach.getDailyWorkout();
	}
}
