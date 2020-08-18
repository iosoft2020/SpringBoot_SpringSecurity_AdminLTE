package com.iosoft2020.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.iosoft2020.entity.User;

public interface UserService extends UserDetailsService {

    public List<User> getAll();

    public void save(User sysUser);

    public void update(User sysUser);

    public User getById(int id);

    public void delete(int id);

}