package com.myblog.myblog14.service.impl;


import com.myblog.myblog14.Entity.Post;
import com.myblog.myblog14.payload.PostDto;
import com.myblog.myblog14.repository.PostRepository;
import com.myblog.myblog14.service.PostService;

public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {

        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post=new Post();
        post.setTitle(postDto.getTitle() );
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savedPost =postRepository.save(post);
        return null;
    }
}
