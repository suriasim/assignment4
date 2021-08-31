package com.example.assignment3.resource;

import com.example.assignment3.model.Album;
import com.example.assignment3.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumResource {

    @Autowired
    private AlbumService albumService;

    @PostMapping
    public Album saveAlbum(@RequestBody Album album){
        return albumService.saveAlbum(album);
    }

    @GetMapping
    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }


    @GetMapping("/byID")
    public List<Album> getById(@RequestParam(name = "id") String id) {
        return albumService.getById(id);
    }



    @PutMapping
    public Album updateAlbum( @RequestBody Album album) {
        return albumService.updateAlbum(album);
    }

    @DeleteMapping
    public void deleteAlbum(@RequestParam(name = "albumId") String albumId) {
        albumService.deleteAlbum(albumId);
    }



    /*
    @GetMapping("/album")
    public Album getAlbum(){
        return albumService.getAlbum();
    }



    @GetMapping("/allAlbums")
    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }

    @GetMapping("/album/{albumID}")
    public Album getAlbumByID(@PathVariable("albumID") int albumID) {
        return albumService.getAlbumByID(albumID);
    }

    @PutMapping("/album/{albumID}")
    public Album updateAlbum(@PathVariable("albumID") int albumID, @RequestBody Album album) {
        return albumService.updateAlbum(albumID, album);
    }

    @DeleteMapping("/album")
    public Album deleteAlbum(@RequestParam(name = "albumID") int albumID) {
        return albumService.deleteAlbum(albumID);
    }
    */

}
