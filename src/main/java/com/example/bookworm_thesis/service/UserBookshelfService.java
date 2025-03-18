package com.example.bookworm_thesis.service;

import com.example.bookworm_thesis.repository.UserBookshelfRepo;
import org.springframework.stereotype.Service;

@Service
public class UserBookshelfService {
    private final UserBookshelfRepo userBookshelfRepo;

    public UserBookshelfService(UserBookshelfRepo userBookshelfRepo) {
        this.userBookshelfRepo = userBookshelfRepo;
    }
}
