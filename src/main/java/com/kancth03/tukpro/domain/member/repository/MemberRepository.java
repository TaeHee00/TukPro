package com.kancth03.tukpro.domain.member.repository;

import com.kancth03.tukpro.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
