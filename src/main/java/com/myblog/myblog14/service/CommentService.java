package com.myblog.myblog14.service;

import com.myblog.myblog14.payload.CommentDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto, long Postid);

}
