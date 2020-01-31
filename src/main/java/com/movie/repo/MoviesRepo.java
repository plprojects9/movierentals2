package com.movie.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.movie.bo.AllMoviesView;
import com.movie.bo.RentedMoviesView;
import com.movie.entities.Movie;

public interface MoviesRepo extends JpaRepository<Movie, Integer> {
	
	//inner join
	@Query("SELECT new com.movie.bo.RentedMoviesView(c.id, c.firstName, c.lastName, m.title)"
			+ " FROM Customer c INNER JOIN Movie m "
			+ "ON c.movieId = m.id")
	List<RentedMoviesView> fetchRentedMovies();
	
	//right join
	@Query("SELECT new com.movie.bo.AllMoviesView(c.firstName, c.lastName, m.id, m.title)"
			+ " FROM Customer c RIGHT JOIN Movie m "
			+ "ON c.movieId = m.id")
	List<AllMoviesView> fetchAllMovies();
}
