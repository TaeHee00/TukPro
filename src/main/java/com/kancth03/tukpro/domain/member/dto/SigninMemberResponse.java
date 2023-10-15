package com.kancth03.tukpro.domain.member.dto;

import com.kancth03.tukpro.domain.member.entity.Member;

import java.io.Serializable;

/**
 * DTO for {@link com.kancth03.tukpro.domain.member.entity.Member}
 */
public record SigninMemberResponse(
        Long id,
        String email,
        String name
) {
    public static SigninMemberResponse entityToDto(Member member) {
        return new SigninMemberResponse(member.getId(), member.getEmail(), member.getName());
    }
}