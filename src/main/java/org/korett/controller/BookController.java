package org.korett.controller;


import lombok.AllArgsConstructor;
import org.korett.dto.BookDTO;
import org.korett.entity.Book;
import org.korett.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/popular-books")
    public ResponseEntity<?> readAll() {
        return ResponseEntity.ok(bookService.readAll());
    }

    @GetMapping("/popular-book")
    public ResponseEntity<?> readById(@RequestParam(value = "id") Long id) {
        Book book = bookService.readById(id);
        if (book == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(new BookDTO(book.getId(), book.getPoster_url(), book.getTitle(), book.getDescription(), book.getAuthor(), book.getRating()));
    }

}
