package com.project.board.repository;

import com.project.board.entity.Comment;

import java.util.List;
import java.util.Optional;

public class CommentMemoryRepository implements CommentRepository, MemoryRepository {
    /**
     * Read
     */
    @Override
    public Long createComment() {
        return null;
    }

    @Override
    public List<Comment> findByMemberId(Long memberId) {
        return null;
    }

    @Override
    public List<Comment> findByName(String Name) {
        return null;
    }

    @Override
    public List<Comment> findByPostId(Long postId) {
        return null;
    }

    @Override
    public Optional<Comment> findByCommentId(Long CommentId) {
        return Optional.empty();
    }

    @Override
    public List<Comment> findByCommentContent(String commentContent) {
        return null;
    }

    @Override
    public List<Comment> findByParentCommentId(Long parentCommentId) {
        return null;
    }

    @Override
    public List<Comment> findAll() {
        return null;
    }

    /**
     * Delete
     */
    @Override
    public void deleteComment() {

    }

    /**
     * Clear
     */
    @Override
    public void clearStore() {

    }
}
