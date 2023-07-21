package com.staj1.springcoredemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Futbol günlük çalışma planı.";
	}

}
