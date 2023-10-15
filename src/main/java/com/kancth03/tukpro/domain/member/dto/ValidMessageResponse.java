package com.kancth03.tukpro.domain.member.dto;

public record ValidMessageResponse(
        String message
) {
    // 상속으로 묶어서 부모객체로 처리 가능한지 확인
    public static ValidMessageResponse ofLogin(LoginValid valid) {
        return new ValidMessageResponse(valid.name());
    }

    public static ValidMessageResponse ofSignup(SignupValid valid) {
        return new ValidMessageResponse(valid.name());
    }
}
