package com.iosoft2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.iosoft2020.entity.Department;
import com.iosoft2020.service.DepartmentService;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public String list(Model model) {
        model.addAttribute("departments", departmentService.getAll());
        return "Department/list";
    }

    @GetMapping("/department")
    public String toAddPage(Model model) {
        model.addAttribute("departments", departmentService.getAll());
        return "Department/add";
    }

    @PostMapping("/department")
    public String addDepartment(Department department) {
        departmentService.save(department);
        return "redirect:/departments";
    }

    @GetMapping("/department/{id}")
    public String toEditPage(@PathVariable int id, Model model) {
        model.addAttribute("department", departmentService.getById(id));
        return "Department/add";
    }

    @PutMapping("/department")
    public String updateDepartment(Department department) {
        departmentService.update(department);
        return "redirect:/departments";
    }

    @DeleteMapping("/department/{id}")
    public String deleteDepartment(@PathVariable int id) {
        departmentService.delete(id);
        return "redirect:/departments";
    }

}
