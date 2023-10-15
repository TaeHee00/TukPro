package com.kancth03.tukpro.domain.member.controller;

import com.kancth03.tukpro.domain.member.dto.*;
import com.kancth03.tukpro.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/member")
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public SignupMemberResponse signupMember(@RequestBody SignupMemberRequest request) {
        return memberService.signupMember(request);
    }

    @PostMapping("/valid")
    public ValidMessageResponse signupValid(@RequestBody SignupMemberRequest request) {
        return memberService.signupValid(request);
    }

    @PostMapping("/login")
    public LoginMemberResponse loginMember(@RequestBody LoginMemberRequest request) {
        return memberService.loginMember(request);
    }
    
    @PostMapping("/login/valid")
    public ValidMessageResponse loginValid(@RequestBody LoginMemberRequest request) {
        return memberService.loginValid(request);
    }
}
