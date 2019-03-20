package com.example.postspa.repository;

import com.example.postspa.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {
    List<Post> findAllByOrderById();
    void deleteById(Integer id);
}
