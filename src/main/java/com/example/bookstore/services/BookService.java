package com.example.bookstore.services;

import com.example.bookstore.dto.BookDto;
import com.example.bookstore.entity.Book;
import com.example.bookstore.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    //save
    public BookDto save(BookDto bookDto){
        return BookDto.fromEntity(repository.save(Book.fromDto(bookDto)));
    }
    //findall
    public List<BookDto> findAll() {
        return repository.findAll().stream().map(book -> BookDto.fromEntity(book)).collect(Collectors.toList());

    }
    //findById
    public BookDto findById(Integer id) {
        return BookDto.fromEntity(repository.findById(id).orElseThrow(NoSuchElementException::new));
    }
    //edit
    public BookDto edit(BookDto bookDto){
        return BookDto.fromEntity(repository.save(Book.fromDto(bookDto)));

    }
    //delete
    public void delete(Integer id){
        repository.deleteById(id);
    }
}
