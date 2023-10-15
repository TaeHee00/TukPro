package com.kancth03.tukpro.domain.member.controller;

import com.kancth03.tukpro.domain.member.dto.SignupMemberRequest;
import com.kancth03.tukpro.domain.member.dto.SignupMemberResponse;
import com.kancth03.tukpro.domain.member.repository.MemberRepository;
import com.kancth03.tukpro.domain.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/member")
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public SignupMemberResponse signupMember(@RequestBody SignupMemberRequest request) {
        return memberService.signupMember(request);
    }
}
