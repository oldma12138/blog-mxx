package com.mxx.blog.common.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseResult<T> implements Serializable {
    int code;
    String msg;
    T data;

    public BaseResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResult() {
    }

    /**
     * 默认的成功
     * @return
     */
    public BaseResult<T> success(){
        return new BaseResult<T>(Status.SUCCESS.Code,Status.SUCCESS.msg);
    }

    /**
     * 成功 + 返回的成功信息
     * @param data
     * @return
     */
    public BaseResult<T> sussess(T data){
        return new BaseResult<T>(Status.SUCCESS.Code,Status.SUCCESS.msg,data);
    }

    /**
     * 默认的失败
     * @return
     */
    public BaseResult<T> error(){
        return new BaseResult<T>(Status.FAIL.Code,Status.FAIL.msg);
    }
    public BaseResult<T> error(int code, String message){
        return new BaseResult<T>(code,message);
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
