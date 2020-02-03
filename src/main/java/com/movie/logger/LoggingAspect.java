package com.movie.logger;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public java.util.List<com.movie.bo.RentedMoviesView> com.movie.controllers.MoviesRestController.getRentedMoviesViewRecords())")
	public void logBeforeRentedMoviesMethodExecution() {
		logger.info("getRentedMoviesViewRecords method called");	
	}
	
	@AfterReturning("execution(public java.util.List<com.movie.bo.RentedMoviesView> com.movie.controllers.MoviesRestController.getRentedMoviesViewRecords())")
	public void logAfterRentedMoviesMethodExecution() {
		logger.info("getRentedMoviesViewRecords method executed");	
	}
	
	@AfterThrowing("execution(public java.util.List<com.movie.bo.RentedMoviesView> com.movie.controllers.MoviesRestController.getRentedMoviesViewRecords())")
	public void logExceptionForRentedMoviesMethodExecution() {
		logger.info("Exception occured during getRentedMoviesViewRecords method exeuction");	
	}
	
	@Before("execution(public java.util.List<com.movie.bo.AllMoviesView> com.movie.controllers.MoviesRestController.getAllMoviesViewRecords())")
	public void logBeforeAllMoviesMethodExecution() {
		logger.info("getAllMoviesViewRecords() method called");	
	}
	
	@AfterReturning("execution(public java.util.List<com.movie.bo.AllMoviesView> com.movie.controllers.MoviesRestController.getAllMoviesViewRecords())")
	public void logAfterAllMoviesMethodExecution() {
		logger.info("getAllMoviesViewRecords() method executed");	
	}
	
	@AfterThrowing("execution(public java.util.List<com.movie.bo.AllMoviesView> com.movie.controllers.MoviesRestController.getAllMoviesViewRecords())")
	public void logExceptionForAllMoviesMethodExecution() {
		logger.info("Exception occured during getAllMoviesViewRecords() method execution");	
	}	
}
