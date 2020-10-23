package com.mxx.blog.common.entity;

import lombok.Data;

import java.util.List;
@Data
public class PageResult<T>{
    private  int rows;
    private  int page;
    private List<T> data;
}
