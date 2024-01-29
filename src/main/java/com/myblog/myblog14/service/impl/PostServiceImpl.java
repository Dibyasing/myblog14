package com.myblog.myblog14.service.impl;


import com.myblog.myblog14.Entity.Comment;
import com.myblog.myblog14.Entity.Post;
import com.myblog.myblog14.Exception.ResourceNotFoundException;
import com.myblog.myblog14.payload.CommentDto;
import com.myblog.myblog14.payload.PostDto;
import com.myblog.myblog14.repository.CommentsRepository;
import com.myblog.myblog14.repository.PostRepository;
import com.myblog.myblog14.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    private ModelMapper modelMapper;

    public PostServiceImpl(PostRepository postRepository,ModelMapper modelMapper) {

        this.postRepository = postRepository;
        this.modelMapper=modelMapper;
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
    public List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort=(sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()))?Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
        Pageable pageable=PageRequest.of(pageNo,pageSize, sort);
        Page<Post> pagePost = postRepository.findAll(pageable);
        List<Post> posts = pagePost.getContent();
        List<PostDto> dtos = posts.stream().map(post -> mapToDto(post)).collect(Collectors.toList());
        return dtos;
    }

    PostDto mapToDto(Post post){//Entity to Dto
        PostDto dto=modelMapper.map(post,PostDto.class);
        return dto;
    }
    Post mapToEntity(PostDto postDto){//Dto to Entity
        Post post=modelMapper.map(postDto,Post.class);
        return post;

    }
    //Post mapToupdateEntity(PostDto postDto){
        //Post post=modelMapper.map(comment, CommentDto.class);
        //return post;
    //}
}
