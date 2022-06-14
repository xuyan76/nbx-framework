package com.sysftech.nbx.commons.utils;

import lombok.Getter;

@Getter
public enum ReturnCodeEnum {

    SUCCESS(200, "成功");

    private Integer code;
    private String message;

    ReturnCodeEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
