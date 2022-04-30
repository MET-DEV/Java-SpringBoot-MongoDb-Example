package com.metsoft.springbootmongo.repositories;

import com.metsoft.springbootmongo.entities.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book,String> {
}
