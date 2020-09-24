package com.zth.entity.dto;

import lombok.Data;

/**
 * @author 3zZ.
 * Date: 2020/9/25.
 * 泛型接口
 */
@Data
public class Result<T> {

    // 本次请求结果的详情
    private int code;

    // 本次请求的结果
    private String msg;

    // 本次请求返回的结果集
    private T data;
}
