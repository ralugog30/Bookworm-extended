package com.example.bookworm_thesis.controller;

import com.example.bookworm_thesis.service.UserBookshelfService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bookshelf")
public class UserBookshelfController {
    private final UserBookshelfService bookshelfService;

    public UserBookshelfController(UserBookshelfService bookshelfService) {
        this.bookshelfService = bookshelfService;
    }
}
