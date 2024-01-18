package com.myblog.myblog14.service.impl;


import com.myblog.myblog14.Entity.Post;
import com.myblog.myblog14.Exception.ResourceNotFoundException;
import com.myblog.myblog14.payload.PostDto;
import com.myblog.myblog14.repository.PostRepository;
import com.myblog.myblog14.service.PostService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {

        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = mapToEntity(postDto);
        Post savedPost =postRepository.save(post);
        PostDto dto = mapToDto(savedPost);
        return dto;

        //PostDto dto = new PostDto();
        //dto.setTitle(savedPost.getTitle());
        //dto.setContent(savedPost.getContent());
        //dto.setDescription(savedPost.getDescription());
        //return dto;
    }

    @Override
    public PostDto getPostById(long id) {
        Post post=postRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Post not found with id:"+id)
        );
        PostDto dto = new PostDto();
        dto.setTitle(post.getTitle());
        dto.setContent(post.getContent());
        dto.setDescription(post.getDescription());
        return dto;
    }

    @Override
    public List<PostDto> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        List<PostDto> dtos = posts.stream().map(post -> mapToDto(post)).collect(Collectors.toList());
        return dtos;
    }

    PostDto mapToDto(Post post){
        PostDto dto = new PostDto();
        dto.setTitle(post.getTitle());
        dto.setContent(post.getContent());
        dto.setDescription(post.getDescription());
        return dto;
    }
    Post mapToEntity(PostDto postDto){
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        return post;
    }
}
