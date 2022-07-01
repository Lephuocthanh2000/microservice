package com.example.cartservice.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@Data
@Getter
@Setter
public class Product {
    @Id
    private Long id;

    private String name;

    private Double price;
}
