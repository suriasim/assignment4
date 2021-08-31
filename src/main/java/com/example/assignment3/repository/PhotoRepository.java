package com.example.assignment3.repository;

import com.example.assignment3.model.Photo;
import com.example.assignment3.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PhotoRepository extends MongoRepository<Photo,String> {
    List<Photo> findAllById(String id);
}
