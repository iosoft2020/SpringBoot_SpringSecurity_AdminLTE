package com.iosoft2020.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.iosoft2020.entity.User;
import com.iosoft2020.service.RoleService;
import com.iosoft2020.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @GetMapping("/users")
    public String list(Model model) {
        model.addAttribute("users", userService.getAll());
        return "User/list";
    }

    @GetMapping("/user")
    public String toAddPage(Model model) {
        model.addAttribute("roles", roleService.getAll());
        return "User/add";
    }

    @PostMapping("/user")
    public String addUser(User user) {
        userService.save(user);
        return "redirect:/users";
    }

    @GetMapping("/user/{id}")
    public String toEditPage(@PathVariable int id, Model model) {
        model.addAttribute("user", userService.getById(id));
        model.addAttribute("roles", roleService.getAll());
        return "User/add";
    }

    @PutMapping("/user")
    public String updateUser(User user) {
        userService.update(user);
        return "redirect:/users";
    }

    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id) {
        userService.delete(id);
        return "redirect:/users";
    }

}
