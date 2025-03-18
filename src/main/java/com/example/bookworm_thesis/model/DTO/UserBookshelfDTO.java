package com.example.bookworm_thesis.model.DTO;

import com.example.bookworm_thesis.model.ReadingStatus;

public class UserBookshelfDTO {
    private Long id;
    private ReadingStatus status;

    public UserBookshelfDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ReadingStatus getStatus() {
        return status;
    }

    public void setStatus(ReadingStatus status) {
        this.status = status;
    }
}
