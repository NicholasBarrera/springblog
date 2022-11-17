package com.example.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @GetMapping("/hello")
    @ResponseBody
    public String test(){
        return "Hello from Spring";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/bubbles")
    @ResponseBody
    public String bubbles() {
        return "Bubbububbububububububububububububububu";
    }

}
