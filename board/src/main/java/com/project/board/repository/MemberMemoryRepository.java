package com.project.board.repository;

import com.project.board.entity.Member;

import java.util.List;
import java.util.Optional;

public class MemberMemoryRepository implements MemberRepository {
    /**
     * Create
     */
    @Override
    public Member createMember(Member member) {
        return null;
    }

    /**
     * Read
     */
    @Override
    public Optional<Member> findByMemberId(Long memberId) {
        return Optional.empty();
    }

    @Override
    public List<Member> findByName(String Name) {
        return null;
    }

    @Override
    public List<Member> findByMemberType(String memberType) {
        return null;
    }

    @Override
    public List<Member> findAll() {
        return null;
    }

    /**
     * Update
     */
    @Override
    public void updateMember() {

    }

    /**
     * Delete
     */
    @Override
    public void deleteMember() {

    }
}
