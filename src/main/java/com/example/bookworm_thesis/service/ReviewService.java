package com.example.bookworm_thesis.service;

import com.example.bookworm_thesis.repository.ReviewRepo;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private final ReviewRepo reviewRepo;

    public ReviewService(ReviewRepo reviewRepo) {
        this.reviewRepo = reviewRepo;
    }
}
