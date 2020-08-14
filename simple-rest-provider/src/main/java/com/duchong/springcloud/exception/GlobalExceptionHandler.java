package com.duchong.springcloud.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DUCHONG
 * @since 2019-04-19 11:25
 **/
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, String> handlerException(Exception e) {
        Map<String, String> map = new HashMap<>();
        map.put("code", "1");
        map.put("msg", e.getMessage());
        return map;
    }
}
