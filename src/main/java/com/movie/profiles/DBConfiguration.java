package com.movie.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DBConfiguration {
	
	@Profile("dev")
	@Bean
	public void devDatabaseConnection() {
		
		System.out.println("\n<---- Connecting to a dev database ----->\n");
	}
	
	@Profile("prod")
	@Bean
	public void prodDatabaseConnection() {
		
		System.out.println("\n<---- Connecting to a prod database ---->\n");
	}
}
