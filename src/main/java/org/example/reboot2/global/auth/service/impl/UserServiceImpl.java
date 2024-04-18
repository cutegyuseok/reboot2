package org.example.reboot2.global.auth.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.reboot2.global.auth.dto.UserDTO;
import org.example.reboot2.global.auth.entity.User;
import org.example.reboot2.global.auth.repository.UserRepository;
import org.example.reboot2.global.auth.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public HttpStatus signup(UserDTO.UserSignUpDTO reqDto) {
        userRepository.save(User.builder()
                .email(reqDto.getEmail())
                .password(reqDto.getPassword())
                .name(reqDto.getName())
                .build());
        return HttpStatus.CREATED;
    }
}
