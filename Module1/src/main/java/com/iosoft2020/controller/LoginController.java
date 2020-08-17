package com.iosoft2020.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

//    @PostMapping("/login")
//    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
//            Map<String, Object> map, HttpSession session) {
//
//        if (StringUtils.isNotBlank(username) && "123456".equals(password)) {
//            session.setAttribute("username", username);
//            return "redirect:/menu.html";
//        } else {
//            map.put("msg", "Invalid username or password.");
//            return "login";
//        }
//    }

    @GetMapping("/login")
    public ModelAndView login(String error){
         ModelAndView modelAndView = new ModelAndView("/login");
         modelAndView.addObject("error", error);
        return modelAndView;
    }

}
