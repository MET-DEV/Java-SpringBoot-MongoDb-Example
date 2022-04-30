package com.metsoft.springbootmongo.repositories;

import com.metsoft.springbootmongo.entities.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<Author,String> {
}
