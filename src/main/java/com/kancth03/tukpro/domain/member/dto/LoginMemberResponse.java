package com.kancth03.tukpro.domain.member.dto;

import com.kancth03.tukpro.domain.member.entity.Member;

/**
 * DTO for {@link com.kancth03.tukpro.domain.member.entity.Member}
 */
public record LoginMemberResponse(
        Long id,
        String email,
        String name
) {
    public static LoginMemberResponse entityToDto(Member member) {
        return new LoginMemberResponse(member.getId(), member.getEmail(), member.getName());
    }
}