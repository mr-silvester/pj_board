package com.project.board.repository;

import com.project.board.entity.Post;

import java.util.List;
import java.util.Optional;

public class PostMemoryRepository implements PostRepository, MemoryRepository {
    /**
     * Read
     */
    @Override
    public Long createPost(Post post) {
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
    public Post updatePost(Post post, Post updatedPost) {
        return null;
    }

    /**
     * Delete
     */
    @Override
    public void deletePost(Post post) {

    }

    /**
     * Clear
     */
    @Override
    public void clearStore() {

    }
}
