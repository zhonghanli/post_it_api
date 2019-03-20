package com.example.postspa.controller;


import com.example.postspa.domain.Post;
import com.example.postspa.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class DataController {

    private PostService postService;

    @Autowired
    public DataController(PostService postService){
        this.postService=postService;
    }

    @RequestMapping("/posts")
    public List<Post> posts(){
        return postService.listPosts();
    }

    @PostMapping("/createpost")
    public Post createPost(@RequestBody Post post){
        return postService.save(post);
    }

    @PostMapping("/deletepost")
    public void deletePost(@RequestBody Post post){postService.deletePost(post.getId());}
    

//    @PostMapping("/deletepost")
//    public void deletePost
}
