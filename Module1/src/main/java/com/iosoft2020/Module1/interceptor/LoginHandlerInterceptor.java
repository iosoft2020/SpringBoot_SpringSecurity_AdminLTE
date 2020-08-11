package com.iosoft2020.Module1.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;


public class LoginHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if (null != request.getSession().getAttribute("username")) {
            return true;
        } else {
            request.setAttribute("msg", "please login.");
            request.getRequestDispatcher("/").forward(request, response);
        }
        return false;
    }

}
