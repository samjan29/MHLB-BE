package com.gigajet.mhlb.domain.mail.controller;

import com.gigajet.mhlb.common.dto.SendMessageDto;
import com.gigajet.mhlb.domain.mail.service.MailService;
import com.gigajet.mhlb.domain.user.dto.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MailController {

    private final MailService mailService;

    // 비밀번호 찾기 이메일 발송
    @PostMapping("/users/check/email")
    public ResponseEntity<SendMessageDto> sendMail(@RequestBody UserRequestDto.CheckEmailDto emailDto) {
        return mailService.sendMail(emailDto.getEmail());
    }

}