package com.iosoft2020.Module1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Moudule1Controller {

    @RequestMapping("/Module1/list")
    public String list() {
        return "/Module1/list";
    }

}
