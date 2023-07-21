package com.staj1.springcoredemo;

public class SwimCoach implements Coach{

	public SwimCoach() {
		System.out.println(" -> " + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		return "Yüzme günlük çalışma planı.";
	}
}
