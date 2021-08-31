package com.example.assignment3.service;

import com.example.assignment3.model.Album;
import com.example.assignment3.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    public Album updateAlbum(Album album) {
        return albumRepository.save(album);
    }

    public void deleteAlbum(String albumId) {
        albumRepository.deleteById(albumId);
    }


    public List<Album> getById(String id) {
        return albumRepository.findAllById(id);
    }

/*
    public Album getAlbum() {
        return albumRepository.getAlbum();
    }


    public List<Album> getAllAlbums() {
        return albumRepository.getAllAlbums();
    }

    public Album getAlbumByID(int albumID) {
        return albumRepository.getAlbumByID(albumID);
    }

    public Album updateAlbum(int albumID, Album album) {
        return albumRepository.updateAlbum(albumID, album);
    }

    public Album deleteAlbum(int albumID) {
        return albumRepository.deleteAlbum(albumID);
    }
    */
}
