package com.project.board;

import com.project.board.entity.Comment;
import com.project.board.entity.Member;
import com.project.board.entity.Post;
import com.project.board.repository.CommentRepository;
import com.project.board.repository.PostRepository;
import com.project.board.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

class ReadTest {
    MemberService memberService;
    CommentRepository commentRepository;

    @Test
    void postReadTest() {

    }

    @Test
    void replyReadTest() {
        //Given
        Post post = new Post();
        post.setPostId(000001L);

        Comment comment1 = new Comment();
        Comment comment2 = new Comment();
        Comment comment3 = new Comment();
        Comment comment4 = new Comment();

        comment1.setCommentId(001L).setPost(post).setCommentContent("hello");
        comment2.setCommentId(002L).setPost(post).setCommentContent("spring");
        comment3.setCommentId(003L).setPost(post).setCommentContent("project");
        comment4.setCommentId(004L).setPost(post).setCommentContent("board");

        memberService.createComment(comment1);
        memberService.createComment(comment2);
        memberService.createComment(comment3);
        memberService.createComment(comment4);

        //When

        //Then
        List<Comment> result = commentRepository.findByPostId(000001L);
    }
}
