package com.sysftech.nbx.commons.utils;

import lombok.Getter;

@Getter
public enum ReturnCodeEnum {

    SUCCESS(200, "成功"),
    UNKNOWN_ERROR(300, "未知错误"),
    PARAM_ERROR(301, "参数错误");

    private Integer code;
    private String message;

    ReturnCodeEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
