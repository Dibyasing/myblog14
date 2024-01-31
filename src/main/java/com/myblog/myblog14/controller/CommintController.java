package com.myblog.myblog14.controller;

import com.myblog.myblog14.Entity.Comment;
import com.myblog.myblog14.payload.CommentDto;
import com.myblog.myblog14.repository.CommentsRepository;
import com.myblog.myblog14.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Comments")
public class CommintController {

    private CommentService commentService;
    @PostMapping
    public ResponseEntity<?>createComment(
            @RequestBody CommentDto commentDto,
            @RequestParam long Postid)
    {
        CommentDto dto = commentService.createComment(commentDto, Postid);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?>deletecomment(@PathVariable long id){
        commentService.deletecomment(id);
        return new ResponseEntity<>("comment is deleted!!",HttpStatus.OK);
    }
    @PutMapping("/{id}/post/{postId}")
    public ResponseEntity<CommentDto>updatecomment(@PathVariable long id,@RequestBody CommentDto commentDto,@PathVariable long postId){
        CommentDto dto = commentService.updateComment(id, commentDto,postId);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

}




