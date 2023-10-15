package com.kancth03.tukpro.domain.member.service;

import com.kancth03.tukpro.domain.member.dto.SigninMemberRequest;
import com.kancth03.tukpro.domain.member.dto.SigninMemberResponse;
import com.kancth03.tukpro.domain.member.dto.SignupMemberRequest;
import com.kancth03.tukpro.domain.member.dto.SignupMemberResponse;
import com.kancth03.tukpro.domain.member.entity.Member;
import com.kancth03.tukpro.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;


    public SignupMemberResponse signupMember(SignupMemberRequest request) {
        Member savedMember = memberRepository.save(request.toEntity());
        return SignupMemberResponse.entityToDto(savedMember);
    }

    public SigninMemberResponse signinMember(SigninMemberRequest request) {
        Member member = memberRepository.findMemberByEmailAndPassword(request.email(), request.password())
                .orElseThrow(() -> new IllegalArgumentException("[로그인 실패] Email: " + request.email()));

        return SigninMemberResponse.entityToDto(member);
    }
}
