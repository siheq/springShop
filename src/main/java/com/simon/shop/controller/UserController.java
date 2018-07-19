package com.simon.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping(value="/api/auth")
public class UserController {
//    @GetMapping(value="/login")
    @RequestMapping("/")
    @ResponseBody
    public String UserLogin () {
        return "Success";

    }
}

