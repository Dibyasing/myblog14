package com.myblog.myblog14.service.impl;

import com.myblog.myblog14.Entity.Comment;
import com.myblog.myblog14.Entity.Post;
import com.myblog.myblog14.Exception.ResourceNotFoundException;
import com.myblog.myblog14.payload.CommentDto;
import com.myblog.myblog14.repository.CommentsRepository;
import com.myblog.myblog14.repository.PostRepository;
import com.myblog.myblog14.service.CommentService;

public class CommentServiceImpl implements CommentService {

    private PostRepository postRepository;

    private CommentsRepository commentsRepository;
    @Override
    public CommentDto createComment(CommentDto commentDto, long Postid) {
        Post post = postRepository.findById(Postid).orElseThrow(
                () -> new ResourceNotFoundException("Not Found id:" + Postid)
        );
        {
            Comment comment=new Comment();
            comment.setEmail(commentDto.getEmail());
            comment.setText(commentDto.getText());
            comment.setPost(post);

            Comment saved = commentsRepository.save(comment);

            CommentDto dto=new CommentDto();
            dto.setId(saved.getId());
            dto.setText(saved.getText());
            dto.setEmail(saved.getEmail());
        }
        return null;
    }
}
