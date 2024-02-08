package com.example.mongodbproject.repository;

import com.example.mongodbproject.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    Optional<Person> findById(int id);

    Optional<Person> findByName(String name);

    void deleteById(int id);
}
