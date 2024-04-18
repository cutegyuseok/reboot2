package org.example.reboot2.global.test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello";
    }
}
