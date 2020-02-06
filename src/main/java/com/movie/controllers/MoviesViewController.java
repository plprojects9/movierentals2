package com.movie.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.movie.bo.AllMoviesView;
import com.movie.bo.RentedMoviesView;
import com.movie.entities.Movie;
import com.movie.services.IMovieService;

@Controller
public class MoviesViewController {

	@Autowired
	private IMovieService movieService;
	
	@GetMapping("home")
	public String homePage() {
		
		return "home";
	}
	
	@GetMapping("rentedmovies")
	public String displayRentedMovies(Model model) {
		
		List<RentedMoviesView> rentedMovies = movieService.getListOfRentedMovies();
		model.addAttribute("rentedmovies", rentedMovies);
		
		return "rented_movies";
	}
	
	@GetMapping("allmovies")
	public String displayRentedAndNonRentedMovies(Model model) {
		
		List<AllMoviesView> allMovies = movieService.getListOfRentedAndNonRentedMovies();
		model.addAttribute("allmovies", allMovies);
		
		return "all_movies";
	}
	
	@GetMapping("showaddmovie")
	public String showAddMovie() {
		
		return "add_movie";
	}
	
	@PostMapping("addmovie")
	public String addMovie(@ModelAttribute("movie") Movie movie, Model model) {
		
		String message = movieService.addNewMovie(movie);
		model.addAttribute("msg", message);
		
		return "add_movie";
	}
	
	@GetMapping("showupdatemovie")
	public String showUpdateMovie() {
		
		return "update_mov_category";
	}
	
	@PostMapping("updatemovie")
	public String updateMovieCategory(Integer id, String category, Model model) {
		
		String message = movieService.updateMovieCategoryById(id, category);
		model.addAttribute("msg", message);
		
		return "update_mov_category";
	}
}
