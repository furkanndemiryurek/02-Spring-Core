package com.staj1.springcoredemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

	@Bean
	public Coach swimCoach() {
		return new SwimCoach();
	}
}
