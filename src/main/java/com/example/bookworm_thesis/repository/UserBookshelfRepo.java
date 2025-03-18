package com.example.bookworm_thesis.repository;

import com.example.bookworm_thesis.model.UserBookshelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBookshelfRepo extends JpaRepository<UserBookshelf, Long> {
}
