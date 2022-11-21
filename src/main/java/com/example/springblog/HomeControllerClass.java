package com.example.springblog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllerClass {

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }
}
