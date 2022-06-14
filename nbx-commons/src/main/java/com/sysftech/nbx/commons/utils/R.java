package com.sysftech.nbx.commons.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
}
