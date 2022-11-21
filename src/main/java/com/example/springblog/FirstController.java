package com.example.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/greeting/{name}/{lastname}")
    @ResponseBody
    public String greeting(@PathVariable String name, @PathVariable String lastname) {
        return "Greetings " + name + " " +  lastname;
    }

}
