package com.kancth03.tukpro.domain.member.service;

import com.kancth03.tukpro.domain.member.dto.*;
import com.kancth03.tukpro.domain.member.entity.Member;
import com.kancth03.tukpro.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;


    public SignupMemberResponse signupMember(SignupMemberRequest request) {
        Member savedMember = memberRepository.save(request.toEntity());
        return SignupMemberResponse.entityToDto(savedMember);
    }

    public LoginMemberResponse loginMember(LoginMemberRequest request) {
        Member member = memberRepository.findMemberByEmailAndPassword(request.email(), request.password())
                .orElseThrow(() -> new IllegalArgumentException("[로그인 실패] Email: " + request.email()));

        return LoginMemberResponse.entityToDto(member);
    }

    public ValidMessageResponse loginValid(LoginMemberRequest request) {
        LoginValid loginValid = LoginValid.EMAIL_MISMATCH;;
        Optional<Member> findMember = memberRepository.findByEmail(request.email());

        if (findMember.isPresent()) {
            loginValid = LoginValid.PASSWORD_MISMATCH;
        }
        Optional<Member> loginValidMember = memberRepository.findMemberByEmailAndPassword(request.email(), request.password());
        if (loginValidMember.isPresent()) {
            loginValid = LoginValid.SUCCESS;
        }
        return ValidMessageResponse.ofLogin(loginValid);
    }
}
