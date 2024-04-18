package org.example.reboot2.global.auth.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

public class UserDTO {

    @Getter
    @NoArgsConstructor
    public static class UserSignUpDTO{
        private String email;
        private String name;
        private String password;
    }
}
