package com.example.postspa.service;

import com.example.postspa.domain.Post;
import com.example.postspa.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public List<Post> listPosts(){
        return postRepository.findAllByOrderById();
    }

//    public Post getPostFromId(Integer Id){
//        return postRepository.getOne(Id);
//    }

    public Post save(Post post){
        return postRepository.save(post);
    }

    public void deletePost(Integer Id){
        postRepository.deleteById(Id);
    }

    public void createPost(String title, String content){
        Post post = new Post();
        post.setContent(content);
        post.setTitle(title);
        this.save(post);
    }

}
