package com.example.bookworm_thesis.service;

import com.example.bookworm_thesis.repository.DiscussionRepo;
import org.springframework.stereotype.Service;

@Service
public class DiscussionService {
    private final DiscussionRepo discussionRepo;

    public DiscussionService(DiscussionRepo discussionRepo) {
        this.discussionRepo = discussionRepo;
    }
}
