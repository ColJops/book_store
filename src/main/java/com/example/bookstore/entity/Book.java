package com.example.bookstore.entity;

import com.example.bookstore.dto.BookDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Integer id;
    private String title;
    private String description;
    private String author;
    private String gender;
    private LocalDate timestamp;

    public Book() {
    }

    public Book(Integer id, String title, String description, String author, String gender) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.author = author;
        this.gender = gender;
        this.timestamp = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public static Book fromDto(BookDto bookDto){
        return new Book(
            bookDto.getId(),
                bookDto.getTitle(),
                bookDto.getAuthor(),
                bookDto.getGender(),
                bookDto.getDescription()
        );
    }
}

