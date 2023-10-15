package com.kancth03.tukpro.domain.member.dto;

import com.kancth03.tukpro.domain.member.entity.Member;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link com.kancth03.tukpro.domain.member.entity.Member}
 */
public record SignupMemberResponse(
        Long id,
        String email,
        String name,
        LocalDateTime created_at
) {

    public static SignupMemberResponse entityToDto(Member member) {
        return new SignupMemberResponse(member.getId(), member.getEmail(), member.getName(), member.getCreated_at());
    }
}