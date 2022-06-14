package com.sysftech.nbx.commons.exception;

import com.sysftech.nbx.commons.utils.ReturnCodeEnum;
import lombok.Data;

@Data
public class BusException extends RuntimeException{

    private Integer code;

    public BusException(Integer code, String message){
        super(message);
        this.code = code;
    }

    public BusException(ReturnCodeEnum result){
        super(result.getMessage());
        this.code = result.getCode();
    }

    @Override
    public String toString(){
        return String.format("BusException{code=%s, message=%s}", this.code, this.getMessage());
    }
}
