package com.staj1.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Basketbol günlük çalışma planı.";
	}

}
