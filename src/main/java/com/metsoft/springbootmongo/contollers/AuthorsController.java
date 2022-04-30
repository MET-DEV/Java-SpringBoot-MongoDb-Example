package com.metsoft.springbootmongo.contollers;

import com.metsoft.springbootmongo.entities.Author;
import com.metsoft.springbootmongo.services.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorsController {
    private final AuthorService authorService;

    @Autowired
    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }
    @GetMapping("/")
    public List<Author> getAll(){
        return  authorService.getAuthors();
    }
    @PostMapping("/")
    public void add(@RequestBody Author author){
        authorService.add(author);
    }
}
