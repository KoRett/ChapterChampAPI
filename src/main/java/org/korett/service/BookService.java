package org.korett.service;


import lombok.AllArgsConstructor;
import org.korett.entity.Book;
import org.korett.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> readAll() {
        return bookRepository.findAll();
    }

    public Book readById(Long id) {
        return bookRepository.getReferenceById(id);
    }

}
