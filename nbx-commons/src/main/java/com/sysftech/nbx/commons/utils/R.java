package com.sysftech.nbx.commons.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {

    private int code;

    private String message;

    private T data;

    public static <T> R<T> ok(){
        R<T> r = new R<T>();
        r.setCode(ReturnCodeEnum.SUCCESS.getCode());
        r.setMessage(ReturnCodeEnum.SUCCESS.getMessage());
        return r;
    }

    public static <T> R<T> error(){
        R<T> r = new R<T>();
        r.setCode(ReturnCodeEnum.UNKNOWN_ERROR.getCode());
        r.setMessage(ReturnCodeEnum.UNKNOWN_ERROR.getMessage());
        return r;
    }

    public static <T>R<T> setResult(ReturnCodeEnum result){
        R<T> r = new R<T>();
        r.setCode(result.getCode());
        r.setMessage(result.getMessage());
        return r;
    }
}
