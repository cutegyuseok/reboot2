package org.example.reboot2.global.auth.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.reboot2.global.auth.dto.UserDTO;
import org.example.reboot2.global.auth.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Tag(name = "회원 관련", description = "회원 가입")
public class AuthController {
    private final UserService userService;

    @Operation(
            summary = "사용자 회원가입",
            description = "사용자의 서비스 회원 가입",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "회원가입 성공"
                    )
            }
    )
    @PostMapping("/signup")
    public HttpStatus signUp(@RequestBody UserDTO.UserSignUpDTO reqDto){
        return userService.signup(reqDto);
    }
}
