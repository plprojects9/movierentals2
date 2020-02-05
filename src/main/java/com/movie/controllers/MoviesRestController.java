package com.movie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.bo.AllMoviesView;
import com.movie.bo.RentedMoviesView;
import com.movie.entities.Movie;
import com.movie.services.IMovieService;

@RestController
public class MoviesRestController {
		
	@Autowired
	private IMovieService movieService;
	
	//inner join
	@GetMapping("rented_movies")
	public List<RentedMoviesView> getRentedMoviesViewRecords() {
	
		return movieService.getListOfRentedMovies();
	}

	//right join
	@GetMapping("all_movies")
	public List<AllMoviesView> getAllMoviesViewRecords() {
	
		return movieService.getListOfRentedAndNonRentedMovies();
	}	
	
	@PostMapping("add_movie")
	public String addMovie(Movie movie) {
		
		return movieService.addNewMovie(movie);
	}
	
	@PutMapping("update_movie_cat")
	public String updateMovieCategory(Integer id, String category) {
		
		return movieService.updateMovieCategoryById(id, category);
	}	

}
