package com.myblog.myblog14.controller;

import com.myblog.myblog14.payload.CommentDto;
import com.myblog.myblog14.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Comments")
public class CommintController {

    private CommentService commentService;
    @PostMapping
    public ResponseEntity<CommentDto>createComment(
            @RequestBody CommentDto commentDto,
            @RequestParam long Postid)
    {
        CommentDto dto = commentService.createComment(commentDto, Postid);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
}

