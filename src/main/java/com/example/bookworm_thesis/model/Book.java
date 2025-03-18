package com.example.bookworm_thesis.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    private String id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    private String description;
    private String genre;
    private String coverImageUrl;
    private String publishedDate;
    private String categories;
}
