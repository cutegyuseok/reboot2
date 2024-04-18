package org.example.reboot2.global.auth.service;

import org.example.reboot2.global.auth.dto.UserDTO;
import org.springframework.http.HttpStatus;

public interface UserService {


    HttpStatus signup(UserDTO.UserSignUpDTO reqDto);
}
