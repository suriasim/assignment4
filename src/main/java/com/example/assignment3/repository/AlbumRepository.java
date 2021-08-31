package com.example.assignment3.repository;


import com.example.assignment3.model.Album;
import com.example.assignment3.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlbumRepository extends MongoRepository<Album, String> {
    List<Album> findAllById(String id);
}
