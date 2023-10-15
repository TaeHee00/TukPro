package com.kancth03.tukpro.domain.member.dto;

/**
 * DTO for {@link com.kancth03.tukpro.domain.member.entity.Member}
 */
public record LoginMemberRequest(
        String email,
        String password
) {
}