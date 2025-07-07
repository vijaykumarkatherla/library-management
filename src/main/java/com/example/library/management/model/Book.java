package com.example.library.management.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String isbn;
    private int quantity;
}
