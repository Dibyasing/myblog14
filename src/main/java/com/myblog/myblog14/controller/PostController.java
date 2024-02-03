package com.myblog.myblog14.controller;

import com.myblog.myblog14.payload.PostDto;
import com.myblog.myblog14.service.PostService;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {


    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    //https://localhost:8080/api/posts
    @PreAuthorize("hasRole('ADMIN')")//by this ony Admin can create the post
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
        PostDto dto = postService.createPost(postDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }
    //https://localhost:8080/api/posts/particular?id=1
    @GetMapping("/{id}")
   public ResponseEntity<PostDto> getPostById(@RequestParam long id){
        PostDto dto = postService.getPostById(id);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")//by this ony Admin can create the post
    //https://localhost:8080/api/posts?pageNo=0&pageSize=5&sortBy=title&sortDir=desc
    @GetMapping
    public List<PostDto>getAllPosts(
        @RequestParam(name = "pageNo",required = false,defaultValue = "0")int pageNo,
        @RequestParam(name = "pageSize",required = false,defaultValue = "3") int pageSize,
        @RequestParam(name = "sortBy",required = false,defaultValue = "id") String sortBy,
        @RequestParam(name = "sortDir",required = false,defaultValue = "id") String sortDir
    ){
        List<PostDto> postDtos=postService.getAllPosts(pageNo,pageSize,sortBy,sortDir);
        return postDtos;
    }
    @PreAuthorize("hasRole('ADMIN')")//by this ony Admin can create the post
    @PutMapping
    public ResponseEntity<PostDto>updatePost( @RequestBody PostDto postDto,@PathVariable(name="id")long id){
        PostDto dto = postService.updatePost(postDto, id);
        return  new ResponseEntity<>(dto,HttpStatus.OK);
    }
    @PreAuthorize("hasRole('ADMIN')")//by this ony Admin can create the post
    @DeleteMapping
    public ResponseEntity<String>deletePost(@PathVariable long id){
        postService.deleteByid(id);
        return new ResponseEntity<>("Post has been deleted",HttpStatus.OK);
    }
}
