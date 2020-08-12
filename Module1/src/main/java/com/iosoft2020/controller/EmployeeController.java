package com.iosoft2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.iosoft2020.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public String list(Model model) {
        model.addAttribute("employees", employeeService.getAll());
        return "Module1/list";
    }

    @GetMapping("/employee")
    public String toAddPage(Model model) {
//        model.addAttribute("Module1s", employeeService.getAll());
        return "Module1/add";
    }

}
