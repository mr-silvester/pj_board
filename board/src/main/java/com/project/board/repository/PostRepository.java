package com.project.board.repository;

import com.project.board.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    /**
     * Create
     */
    Long createPost();

    /**
     * Read
     */
    List<Post> findByMemberId(Long memberId);
    List<Post> findByName(String Name);
    Optional<Post> findByPostId(Long postId);
    List<Post> findByPostTitle(String postTitle);
    List<Post> findByPostContent(String postContent);
    List<Post> findAll();


    /**
     * Update
     */
    void updatePost();


    /**
     * Delete
     */
    void deletePost();
}
