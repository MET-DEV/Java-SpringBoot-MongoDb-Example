package com.metsoft.springbootmongo.contollers;

import com.metsoft.springbootmongo.entities.Book;
import com.metsoft.springbootmongo.services.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BooksController {
    private final BookService bookService;
    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping()
    public List<Book> getAllBooks(){
        return  bookService.getBooks();
    }
    @PostMapping()
    public Book addBook(@RequestBody Book book){
        return bookService.createBook(book);
    }
    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book) throws Exception {
        if (book.getId()==null) throw new Exception("ID is required");
        return bookService.createBook(book);
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") String id){
        bookService.deleteBook(id);
    }

}
