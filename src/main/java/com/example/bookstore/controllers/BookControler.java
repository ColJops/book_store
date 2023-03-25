package com.example.bookstore.controllers;

import com.example.bookstore.dto.BookDto;
import com.example.bookstore.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookControler {

    private final BookService service;

    public BookControler(BookService service) {
        this.service = service;
    }
    //save
    @PostMapping
    public ResponseEntity<BookDto> save(@RequestBody BookDto bookDto){
        return ResponseEntity.ok(service.save(bookDto));
    }
    //findAll
    @GetMapping
    public ResponseEntity<List<BookDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
    //findNyId

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> findById(@PathVariable Integer id){
            return ResponseEntity.ok(service.findById(id));
    }
    //edit
    @PutMapping
    public ResponseEntity<BookDto> edit(BookDto bookDto) {
        return ResponseEntity.ok(service.edit(bookDto));
    }
    //delete
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
