package com.myblog.myblog14.service;

import com.myblog.myblog14.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostDto createpost(PostDto postDto);

    PostDto getPostById(long id);



    List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto updatePost(PostDto postDto, long id);

    void deleteByid(long id);
}
