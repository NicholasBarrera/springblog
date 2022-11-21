package com.example.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(method = RequestMethod.GET, path = "/add/{num1}/and/{num2}")
    @ResponseBody
    public String add(@PathVariable int num1, @PathVariable int num2) {
        return "The sum of " + num1 + "and " + num2 + " equals " + (num1 + num2);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sub/{num1}/from/{num2}")
    @ResponseBody
    public String sub(@PathVariable int num1, @PathVariable int num2) {
        return "The difference of " + num1 + "and " + num2 + " equals " + (num1 - num2);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/mult/{num1}/and/{num2}")
    @ResponseBody
    public String mult(@PathVariable int num1, @PathVariable int num2) {
        return num1 + "multiplied by " + num2 + " is " + (num1 * num2);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/div/{num1}/from/{num2}")
    @ResponseBody
    public String div(@PathVariable int num1, @PathVariable int num2) {
        return num1 + "divided by " + num2 + " is " + (num1 / num2);
    }


}
