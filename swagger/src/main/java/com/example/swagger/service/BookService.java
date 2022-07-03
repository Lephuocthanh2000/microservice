package com.example.swagger.service;

import com.example.swagger.Books;
import com.example.swagger.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Books addBook(Integer id, String title, String auth){

        Books book = new Books();
        if(bookRepository.findById(id)!=null){

            book.setId(id.longValue());
            book.setTitle(title);
            book.setAuthor(auth);

        }else {
            return null;
        }
        return book;

    }
}
