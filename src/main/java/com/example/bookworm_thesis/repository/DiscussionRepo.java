package com.example.bookworm_thesis.repository;

import com.example.bookworm_thesis.model.Discussion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscussionRepo extends JpaRepository<Discussion, Long> {
}
