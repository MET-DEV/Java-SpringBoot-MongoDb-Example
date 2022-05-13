package com.metsoft.springbootmongo.entities;

import lombok.*;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("authors")
public class Author implements Serializable {
    @Id
    private String id;
    private String name;
    @DBRef
    private List<Book> books;

}
