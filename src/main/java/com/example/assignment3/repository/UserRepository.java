package com.example.assignment3.repository;

import com.example.assignment3.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAllById(String id);
}
