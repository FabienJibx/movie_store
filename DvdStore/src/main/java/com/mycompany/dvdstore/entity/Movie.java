package com.mycompany.dvdstore.entity;

import org.springframework.data.annotation.Id;

public class Movie {


    @Id
    private Long id;
    private String title;
    private String genre;
    private String description;

    public Movie(Long id, String title, String genre, String description) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.description = description;
    }

    public Movie(Long id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public Movie() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}