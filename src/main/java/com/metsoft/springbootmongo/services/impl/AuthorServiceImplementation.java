package com.metsoft.springbootmongo.services.impl;

import com.metsoft.springbootmongo.entities.Author;
import com.metsoft.springbootmongo.repositories.AuthorRepository;
import com.metsoft.springbootmongo.services.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImplementation implements AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImplementation(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public void add(Author author) {
        authorRepository.save(author);
    }
}
