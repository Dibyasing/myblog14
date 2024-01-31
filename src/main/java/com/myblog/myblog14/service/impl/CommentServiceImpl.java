package com.myblog.myblog14.service.impl;

import com.myblog.myblog14.Entity.Comment;
import com.myblog.myblog14.Entity.Post;
import com.myblog.myblog14.Exception.ResourceNotFoundException;
import com.myblog.myblog14.payload.CommentDto;
import com.myblog.myblog14.repository.CommentsRepository;
import com.myblog.myblog14.repository.PostRepository;
import com.myblog.myblog14.service.CommentService;
import org.modelmapper.ModelMapper;

public class CommentServiceImpl implements CommentService {

    private PostRepository postRepository;

    private CommentsRepository commentsRepository;


    private ModelMapper modelMapper;

    public CommentServiceImpl(PostRepository postRepository, CommentsRepository commentsRepository, ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.commentsRepository = commentsRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CommentDto createComment(CommentDto commentDto, long Postid) {

        Post post = postRepository.findById(Postid).orElseThrow(
                () -> new ResourceNotFoundException("Comment Not Found id:" + Postid)
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

    @Override
    public void deletecomment(long id) {
        commentsRepository.deleteById(id);

    }

    @Override
    public CommentDto updateComment(long id, CommentDto commentDto, long postId) {
        Post post = postRepository.findById(postId).orElseThrow(
                () -> new ResourceNotFoundException("Post Not Found id:" + postId)
        );
        Comment comment = commentsRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Resource not found by id:" + id)
        );

        Comment c = maptoEntity(commentDto);
        c.setId(comment.getId());
        c.setPost(post);
        Comment savedComment = commentsRepository.save(c);

        return maptoDto(savedComment);
    }

    CommentDto maptoDto(Comment comment){
        CommentDto dto = modelMapper.map(comment, CommentDto.class);
        return dto;
    }
    Comment maptoEntity(CommentDto commentDto){
        Comment comment = modelMapper.map(commentDto, Comment.class);
        return comment;
    }
}
