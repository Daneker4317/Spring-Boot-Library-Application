package com.example.studentmanagmentsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "book title should be empty")
    @Column(name = "title" , nullable = false)
    private String title;
    @NotEmpty(message = "book author should be empty")
    @Column(name = "author" , nullable = false)
    private String author;

    @Min(value = 0 , message = "year should be greater than 0")
    @Column(name = "year" , nullable = false)
    private int year;


    @Column(name = "genre" , nullable = false)
    private String genre;


    @Column(name = "description"  , nullable = false)
    private String description;

    public Book(String title, String author, int year, String genre, String description) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.description = description;
    }

    public Book(){}

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}