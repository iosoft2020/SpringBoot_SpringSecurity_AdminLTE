package com.iosoft2020.Module1.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
            Map<String, Object> map, HttpSession session) {

        if (StringUtils.isNotBlank(username) && "123456".equals(password)) {
            session.setAttribute("username", username);
            return "redirect:/menu.html";
        } else {
            map.put("msg", "Invalid username or password.");
            return "login";
        }
    }

}
