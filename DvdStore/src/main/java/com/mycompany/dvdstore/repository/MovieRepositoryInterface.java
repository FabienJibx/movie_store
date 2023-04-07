package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MovieRepositoryInterface extends CrudRepository<Movie,Long> {
    /*Movie add(Movie movie);
    List<Movie> list();
    Movie getById(long id);*/
}
