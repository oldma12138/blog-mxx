package com.mxx.blog.sys.controller;


import com.mxx.blog.common.entity.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {

    @GetMapping("/")
    public Result<String> test(){

        return new Result<String>().success();
    }







}
