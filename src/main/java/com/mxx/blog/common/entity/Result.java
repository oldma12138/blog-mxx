package com.mxx.blog.common.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    int code;
    String msg;
    T data;

    public Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result() {
    }

    /**
     * 默认的成功
     * @return
     */
    public Result<T> success(){
        return new Result<T>(Status.SUCCESS.Code,Status.SUCCESS.msg);
    }

    /**
     * 成功 + 返回的成功信息
     * @param data
     * @return
     */
    public Result<T> sussess(T data){
        return new Result<T>(Status.SUCCESS.Code,Status.SUCCESS.msg,data);
    }

    /**
     * 默认的失败
     * @return
     */
    public Result<T> error(){
        return new Result<T>(Status.FAIL.Code,Status.FAIL.msg);
    }
    public Result<T> error(int code,String message){
        return new Result<T>(code,message);
    }

    public enum Status {
        SUCCESS(0,"成功"),
        FAIL(1,"失败");

        private int Code;
        private String msg;

        Status(int code, String msg) {
            Code = code;
            this.msg = msg;
        }
    }





}
