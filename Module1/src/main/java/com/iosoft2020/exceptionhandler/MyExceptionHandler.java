package com.iosoft2020.exceptionhandler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.iosoft2020.exception.SystemException;

@ControllerAdvice
public class MyExceptionHandler {


    @ExceptionHandler(SystemException.class)
    public String systemException(Exception e, HttpServletRequest request) {

        Map<String,Object> myErrorAttributes = new HashMap<>();
        myErrorAttributes.put("code", "900001");
        myErrorAttributes.put("message", "data not found");
        request.setAttribute("javax.servlet.error.status_code", 500);
        request.setAttribute("myErrorAttributes", myErrorAttributes);
        return "forward:/error";

    }

}
