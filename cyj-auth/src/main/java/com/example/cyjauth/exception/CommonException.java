package com.example.cyjauth.exception;

import com.example.cyjcommon.utils.ResultCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class CommonException extends Exception {

    private static final long serialVersionUID = 1L;
    private int exceptionCode;
    private String message;

    public CommonException(ResultCode resultCode) {
        this.exceptionCode = resultCode.code();
        this.message = resultCode.message();
    }

}
