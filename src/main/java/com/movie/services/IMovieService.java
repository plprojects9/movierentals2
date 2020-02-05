package com.movie.services;

import java.util.List;

import com.movie.bo.AllMoviesView;
import com.movie.bo.RentedMoviesView;
import com.movie.entities.Movie;

public interface IMovieService {
		
	List<RentedMoviesView> getListOfRentedMovies();
	List<AllMoviesView> getListOfRentedAndNonRentedMovies();
	String addNewMovie(Movie movie);
	String updateMovieCategoryById(Integer id, String category);
}
