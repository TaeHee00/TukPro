package com.kancth03.tukpro.domain.member.controller;

import com.kancth03.tukpro.domain.member.dto.SigninMemberRequest;
import com.kancth03.tukpro.domain.member.dto.SigninMemberResponse;
import com.kancth03.tukpro.domain.member.dto.SignupMemberRequest;
import com.kancth03.tukpro.domain.member.dto.SignupMemberResponse;
import com.kancth03.tukpro.domain.member.repository.MemberRepository;
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

    @GetMapping
    public SigninMemberResponse signinMember(@RequestBody SigninMemberRequest request) {
        return memberService.signinMember(request);
    }
}
