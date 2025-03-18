package com.example.bookworm_thesis.service;

import com.example.bookworm_thesis.repository.BookRepo;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }
}
