package com.iosoft2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.iosoft2020.entity.Role;
import com.iosoft2020.service.RoleService;

@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/roles")
    public String list(Model model) {
        model.addAttribute("roles", roleService.getAll());
        return "Role/list";
    }

    @GetMapping("/role")
    public String toAddPage(Model model) {
        model.addAttribute("roles", roleService.getAll());
        return "Role/add";
    }

    @PostMapping("/role")
    public String addRole(Role role) {
        roleService.save(role);
        return "redirect:/roles";
    }

    @GetMapping("/role/{id}")
    public String toEditPage(@PathVariable int id, Model model) {
        model.addAttribute("role", roleService.getById(id));
        return "Role/add";
    }

    @PutMapping("/role")
    public String updateRole(Role role) {
        roleService.update(role);
        return "redirect:/roles";
    }

    @DeleteMapping("/role/{id}")
    public String deleteRole(@PathVariable int id) {
        roleService.delete(id);
        return "redirect:/roles";
    }

}
