package com.example.assignment3.resource;

import com.example.assignment3.model.Comment;
import com.example.assignment3.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comment")
public class CommentResource {

    @Autowired
    private CommentService commentService;

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment) {
        return commentService.saveComment(comment);
    }

    @GetMapping
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }


    @GetMapping("/byID")
    public List<Comment> getById(@RequestParam(name = "id") String id) {
        return commentService.getById(id);
    }



    @PutMapping
    public Comment updateComment( @RequestBody Comment comment) {
        return commentService.updateComment(comment);
    }

    @DeleteMapping
    public void deleteComment(@RequestParam(name = "commentId") String commentId) {
        commentService.deleteComment(commentId);
    }



}
