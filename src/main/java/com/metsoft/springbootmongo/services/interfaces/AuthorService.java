package com.metsoft.springbootmongo.services.interfaces;

import com.metsoft.springbootmongo.entities.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAuthors();
    void add(Author author);
}
