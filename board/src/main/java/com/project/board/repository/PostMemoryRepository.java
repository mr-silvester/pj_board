package com.project.board.repository;

import com.project.board.entity.Post;

import java.util.List;
import java.util.Optional;

public class PostMemoryRepository implements PostRepository {
    /**
     * Read
     */
    @Override
    public Long createPost() {
        return null;
    }

    @Override
    public List<Post> findByMemberId(Long memberId) {
        return null;
    }

    @Override
    public List<Post> findByName(String Name) {
        return null;
    }

    @Override
    public Optional<Post> findByPostId(Long postId) {
        return Optional.empty();
    }

    @Override
    public List<Post> findByPostTitle(String postTitle) {
        return null;
    }

    @Override
    public List<Post> findByPostContent(String postContent) {
        return null;
    }

    @Override
    public List<Post> findAll() {
        return null;
    }

    /**
     * Update
     */
    @Override
    public void updatePost() {

    }

    /**
     * Delete
     */
    @Override
    public void deletePost() {

    }
}
