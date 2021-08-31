package com.example.assignment3.repository;

import com.example.assignment3.model.Comment;
import com.example.assignment3.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommentRepository extends MongoRepository<Comment, String> {
    List<Comment> findAllById(String id);
}
