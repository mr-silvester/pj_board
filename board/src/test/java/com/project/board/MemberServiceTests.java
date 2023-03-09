package com.project.board;

import com.project.board.repository.*;
import com.project.board.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class MemberServiceTests {
    MemberRepository memberRepository = new MemberMemoryRepository();
    PostRepository postRepository = new PostMemoryRepository();
    CommentRepository commentRepository = new CommentMemoryRepository();

    /**
     * Create
     */
    @Test
    void signUpTest() {
        //Given


        //When


        //Then

    }
}
