package com.kancth03.tukpro.domain.member.repository;

import com.kancth03.tukpro.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findMemberByEmailAndPassword(String email, String password);
    Optional<Member> findByEmail(String email);
    Optional<Member> findByName(String name);
}
