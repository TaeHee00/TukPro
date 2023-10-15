package com.kancth03.tukpro.domain.member.dto;

import com.kancth03.tukpro.domain.member.entity.Member;

import java.io.Serializable;

/**
 * DTO for {@link com.kancth03.tukpro.domain.member.entity.Member}
 */
public record SignupMemberRequest(
        String email,
        String password,
        String name
) {
    public Member toEntity() {
        return Member.of(email, password, name);
    }
}
