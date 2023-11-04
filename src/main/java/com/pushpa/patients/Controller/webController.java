package com.pushpa.patients.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webController {
    @GetMapping("/login")
    public String login(){
        return "loginForm";
    }

    @GetMapping("/welcome")
    public String Home(){
        return "Home";
    }
}
