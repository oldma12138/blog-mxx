package com.mxx.blog.sys.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/in")
    public String in(){

        return "/front/index/login";
    }
    @RequestMapping("/out")
    public String out(){

        return "/front/index/login";
    }


}
