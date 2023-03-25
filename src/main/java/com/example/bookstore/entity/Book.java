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
    private String name;
    private String description;
    private LocalDate timestamp;

    public Book() {
    }

    public Book(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.timestamp = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static Book fromDto(BookDto bookDto){
        return new Book(
            bookDto.getId(),
                bookDto.getName(),
                bookDto.getDescription()
        );
    }
}

