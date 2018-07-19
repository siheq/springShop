package com.simon.shop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value="/api/auth")
public class UserController {
//    @GetMapping(value="/login")
    @RequestMapping("/")
    public String UserLogin () {
        return "Success";

    }
}

