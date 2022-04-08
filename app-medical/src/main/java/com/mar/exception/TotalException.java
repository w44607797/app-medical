package com.mar.exception;

import lombok.extern.slf4j.Slf4j;

/**
 * @author guokaifeng
 * @createDate: 2022/4/8
 **/

@Slf4j
public class TotalException extends Exception{
    private String code;

    public TotalException(String code,String message,String logMess){
        this(message);
        this.code = code;
        log.error(logMess);
    }
    public TotalException(){}
    public TotalException(String message){super(message);}
    //    public void setCode(String code){
//        this.code = code;
//    }
    public String getCode(){
        return this.code;
    }
}
