package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books/")
public class BookController {

    private final BookServices bookServices;

    @Autowired
    public BookController(BookServices bookServices){
        this.bookServices = bookServices;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookServices.getAllBooks();
        return  ResponseEntity.ok(books);
    }
}

