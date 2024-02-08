package com.example.mongodbproject.repository;

import com.example.mongodbproject.entity.Adress;
import com.example.mongodbproject.entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdressRepository extends MongoRepository<Adress, String> {
    Optional<Adress> findById(int id);
    void deleteById(int id);
}
