package com.example.swagger.controller;

import com.example.swagger.service.BookService;
import io.tej.SwaggerCodgen.api.BookApi;
import io.tej.SwaggerCodgen.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController implements BookApi
{
    @Autowired
    BookService bookService;

    @Override
    public ResponseEntity<String> addBook(Book book) {
        return ResponseEntity.ok(book.getTitle()+" is added");
    }

    @Override
    public ResponseEntity<List<Book>> _getBooks() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(bookService.addBook(5,"thanh","123"));
        return ResponseEntity.ok(bookList);
    }

//    @Override
//    public ResponseEntity<List<Book>> getBooks() {
//        List<Book> bookList = new ArrayList<>();
//        bookList.add(bookService.addBook(5,"thanh","123"));
//        return ResponseEntity.ok(bookList);
//    }

}