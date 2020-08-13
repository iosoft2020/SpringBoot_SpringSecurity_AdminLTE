package com.iosoft2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.iosoft2020.entity.Employee;
import com.iosoft2020.exception.SystemException;
import com.iosoft2020.service.DepartmentService;
import com.iosoft2020.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/employees")
    public String list(Model model) {
        if(true) {
            throw new SystemException();
        }
        model.addAttribute("employees", employeeService.getAll());
        return "Employee/list";
    }

    @GetMapping("/employee")
    public String toAddPage(Model model) {
        model.addAttribute("departments", departmentService.getAll());
        return "Employee/add";
    }

    @PostMapping("/employee")
    public String addEmployee(Employee employee) {
        employeeService.save(employee);
        return "redirect:/employees";
    }

    @GetMapping("/employee/{id}")
    public String toEditPage(@PathVariable int id, Model model) {
        model.addAttribute("employee", employeeService.getById(id));
        model.addAttribute("departments", departmentService.getAll());
        return "Employee/add";
    }

    @PutMapping("/employee")
    public String updateEmployee(Employee employee) {
        employeeService.update(employee);
        return "redirect:/employees";
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        employeeService.delete(id);
        return "redirect:/employees";
    }

}
