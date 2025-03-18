package com.example.bookworm_thesis.controller;

import com.example.bookworm_thesis.service.BookApiService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "*")  // Allow frontend requests
public class BookApiController {

    private final BookApiService bookApiService;

    public BookApiController(BookApiService bookApiService) {
        this.bookApiService = bookApiService;
    }

    @GetMapping("/search")
    public Map<String, Object> searchBooks(@RequestParam String query) {
        return bookApiService.searchBooks(query);
    }
}
