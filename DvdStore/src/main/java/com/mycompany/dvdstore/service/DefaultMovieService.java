package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultMovieService implements MovieServiceInterface{


    @Qualifier("movieRepositoryInterface")
    @Autowired
    private MovieRepositoryInterface movieRepository;

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie registerMovie(Movie movie){
        return movieRepository.save(movie);
    }

    @Override
    public Iterable<Movie> getMovieList() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(long id) {
        return movieRepository.findById(id).orElseThrow();
    }
}