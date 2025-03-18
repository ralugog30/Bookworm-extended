package com.example.bookworm_thesis.service;

import com.example.bookworm_thesis.repository.AuthorRepo;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private final AuthorRepo repository;

    public AuthorService(AuthorRepo repository) {

        this.repository = repository;
    }


}
