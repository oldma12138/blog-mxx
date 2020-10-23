package com.mxx.blog.sys.controller;


import com.mxx.blog.common.entity.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/")
public class testController {

    @GetMapping("/")
    public BaseResult<String> test(){

        return new BaseResult<String>().success();
    }







}
