package com.mkyong.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomError {

    String errCode;
    String errDesc;

    public CustomError(String errCode, String errDesc) {
        this.errCode = errCode;
        this.errDesc = errDesc;
    }

    @Override
    public String toString() {
        return "CustomError{" +
                "errCode='" + errCode + '\'' +
                ", errDesc='" + errDesc + '\'' +
                '}';
    }

}
