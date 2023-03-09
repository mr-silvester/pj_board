package com.project.board.service;


import com.project.board.entity.Comment;
import com.project.board.entity.Member;
import com.project.board.entity.Post;
import com.project.board.repository.CommentRepository;
import com.project.board.repository.MemberRepository;
import com.project.board.repository.PostRepository;

public interface MemberService {
    /**
     * Sign up
     */
    public Long signUp(Member member);

    /**
     * ValidateDuplicateMemberName
     */




}
