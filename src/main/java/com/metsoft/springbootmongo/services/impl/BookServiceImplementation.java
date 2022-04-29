package com.metsoft.springbootmongo.services.impl;

import com.metsoft.springbootmongo.entities.Book;
import com.metsoft.springbootmongo.repositories.BookRepository;
import com.metsoft.springbootmongo.services.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplementation implements BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImplementation(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(String id) {
        bookRepository.deleteById(String.valueOf(id));
    }
}
