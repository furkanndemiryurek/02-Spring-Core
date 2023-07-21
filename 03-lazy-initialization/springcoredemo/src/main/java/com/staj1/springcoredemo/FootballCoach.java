package com.staj1.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FootballCoach implements Coach{

	public FootballCoach() {
		System.out.println(" -> " + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "Futbol günlük çalışma planı.";
	}

}
