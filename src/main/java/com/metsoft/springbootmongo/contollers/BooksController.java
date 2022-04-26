package com.metsoft.springbootmongo.contollers;

import com.metsoft.springbootmongo.entities.Book;
import com.metsoft.springbootmongo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {
    private final BookRepository bookRepository;
    @Autowired
    public BooksController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @GetMapping()
    public List<Book> getAllBooks(){
        return  bookRepository.findAll();
    }
    @PostMapping()
    public Book addBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

}
