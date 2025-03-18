package com.example.bookworm_thesis.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_bookshelf")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserBookshelf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ReadingStatus status; // e.g., READING, COMPLETED, WANT_TO_READ
}
