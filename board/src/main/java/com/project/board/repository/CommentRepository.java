package com.project.board.repository;

import com.project.board.entity.Comment;
import com.project.board.entity.Post;

import java.util.List;
import java.util.Optional;

public interface CommentRepository {
    /**
     * Create
     */
    void createComment();

    /**
     * Read
     */
    List<Comment> findByMemberId(Long memberId);
    List<Comment> findByName(String Name);
    List<Comment> findByPostId(Long postId);
    Optional<Comment> findByCommentId(Long CommentId);
    List<Comment> findByCommentContent(String commentContent);
    List<Comment> findAll();


    /**
     * Update
     */



    /**
     * Delete
     */
}
