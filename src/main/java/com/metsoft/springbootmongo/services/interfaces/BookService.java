package com.metsoft.springbootmongo.services.interfaces;

import com.metsoft.springbootmongo.entities.Book;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
    Book createBook(Book book);
    void deleteBook(String id);

}
