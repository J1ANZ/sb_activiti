package com.wangjzh.exception;
/**
 * @description 自定义异常
 * @author wangjzh
 * @version 1.0.0
 * @date 2018-6-7 00:45:09
 */
public class BaseException extends RuntimeException{
    private String code;//状态码

    public BaseException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
