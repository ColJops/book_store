package com.example.bookstore.dto;

import com.example.bookstore.entity.Book;
public class BookDto {
    private Integer id;
    private String title;
    private String author;
    private String gender;
    private String description;

    public Integer getId() {
        return id;
    }

    public BookDto(Integer id, String title, String author, String gender, String description) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.gender = gender;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGender() {
        return gender;
    }

    public String getDescription() {
        return description;
    }

    public static BookDto fromEntity(Book book) {
        return new BookDto(
                book.getId(),
                book.getTitle(),
                book.getGender(),
                book.getAuthor(),
                book.getDescription()
        );
    }
}
