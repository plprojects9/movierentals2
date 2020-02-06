package com.movie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.bo.AllMoviesView;
import com.movie.bo.RentedMoviesView;
import com.movie.entities.Movie;
import com.movie.repo.IMovieRepo;

@Service
public class MovieServiceImpl implements IMovieService {

	@Autowired
	private IMovieRepo movieRepo;
	
	@Override
	public List<RentedMoviesView> getListOfRentedMovies() {
		
		List<RentedMoviesView> rentedMovies = movieRepo.fetchRentedMovies();
		
		printToConsole(rentedMovies, "RentedMoviesView");
						
		return rentedMovies;
	}

	@Override
	public List<AllMoviesView> getListOfRentedAndNonRentedMovies() {
		
		List<AllMoviesView> allMovies = movieRepo.fetchAllMovies();
		
		printToConsole(allMovies, "AllMoviesView");
								
		return allMovies;
	}

	@Override
	public String addNewMovie(Movie movie) {
		
		if(movie.getTitle() != null && !movie.getTitle().isEmpty() && !movie.getCategory().isEmpty()) {
			movieRepo.save(movie);
			
			return "Movie added successfully";
		}
		
		return "Please enter valid values for movie title & category"; 
	}

	@Override
	public String updateMovieCategoryById(Integer id, String category) {
		
		try {
			Movie movie = movieRepo.findById(id).get();
				
			if(category != null && !category.isEmpty()) {
				movie.setCategory(category);
				movieRepo.save(movie);
			}
			else {
				throw new Exception("Category is empty");
			}
				
			return "Movie's category has been updated successfully";
		} catch (Exception e){	
			return "Please enter valid values for movie id & category";
		}		
	}
	
	private <T> void printToConsole(List<T> list, String listParamType) {
		
		System.out.println("\nPrinting the list using LAMBDA Expression: ");
		System.out.println("---------------------------------------");
		list.forEach(listItem -> System.out.println(listItem)); // lambda expression
		
		System.out.println("\nPrinting list of movies starting with a letter 'A' ");
		System.out.println("---------------------------------------");
		if(listParamType == "RentedMoviesView")
			list.stream().filter(s -> (((RentedMoviesView)s).getRentedmoviename()).
											startsWith("A")).forEach(System.out::println);
		else
			list.stream().filter(s -> (((AllMoviesView)s).getRentedmoviename()).
											startsWith("A")).forEach(System.out::println);
	}
}
