package com.example.swagger;

import io.tej.SwaggerCodgen.model.Book;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books extends Book {
    @Id
    Integer id;
}
