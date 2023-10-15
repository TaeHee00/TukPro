package com.kancth03.tukpro.domain.member.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.kancth03.tukpro.domain.member.entity.Member}
 */
public record SigninMemberRequest(
        String email,
        String password
) {
}