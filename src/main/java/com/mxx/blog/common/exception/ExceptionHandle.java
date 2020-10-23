package com.mxx.blog.common.exception;

import com.mxx.blog.common.entity.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class ExceptionHandle {

    @ExceptionHandler(Exception.class) //表示让Spring捕获到所有抛出的SignException异常，并交由这个被注解的方法处理。
    @ResponseStatus(HttpStatus.BAD_REQUEST)  //表示设置状态码。
    Result handleException(){
        return new Result().error(1111,"系统异常");
    }

}
