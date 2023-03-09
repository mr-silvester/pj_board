package com.project.board.repository;

import com.project.board.entity.Member;
import com.project.board.entity.Post;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Optional<Member> findByMemberId(Long memberId);
    List<Member> findByName(String Name);
    List<Member> findByMemberType(String memberType);
    List<Member> findAll();
}
