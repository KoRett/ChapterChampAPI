package org.korett.dto;

public record BookDTO(
        Long id,
        String poster_url,
        String title,
        String description,
        String author,
        Float rating) {
}
