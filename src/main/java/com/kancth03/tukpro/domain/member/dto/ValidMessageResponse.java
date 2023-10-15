package com.kancth03.tukpro.domain.member.dto;

public record ValidMessageResponse(
        String message
) {
    public static ValidMessageResponse ofLogin(LoginValid valid) {
        return new ValidMessageResponse(valid.name());
    }
}
