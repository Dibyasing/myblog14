package com.myblog.myblog14.service;

import com.myblog.myblog14.payload.CommentDto;


public interface CommentService {
    CommentDto createComment(CommentDto commentDto, long Postid);

    void deletecomment(long id);

    CommentDto updateComment(long id, CommentDto commentDto, long postId);
}
