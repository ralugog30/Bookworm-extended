package com.example.bookworm_thesis.repository;

import com.example.bookworm_thesis.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Long> {
}
