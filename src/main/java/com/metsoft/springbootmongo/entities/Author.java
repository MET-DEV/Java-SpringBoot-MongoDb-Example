package com.metsoft.springbootmongo.entities;

import lombok.*;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("authors")
public class Author {
    @Id
    private String id;
    private String name;

}
