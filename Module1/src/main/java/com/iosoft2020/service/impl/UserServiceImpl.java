package com.iosoft2020.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.iosoft2020.entity.User;
import com.iosoft2020.mapper.UserMapper;
import com.iosoft2020.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails = userMapper.findByName(username);
        if (userDetails == null) {
            throw new UsernameNotFoundException(username + " not found ");
        }
        return userDetails;
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public void save(User sysUser) {
        User target = new User();
        BeanUtils.copyProperties(sysUser, target);
        target.setPassword(passwordEncoder.encode(sysUser.getPassword()));
        userMapper.save(target);
    }

    @Override
    public User getById(int id) {
        return userMapper.getById(id);
    }

    @Override
    public void update(User sysUser) {
        userMapper.update(sysUser);

    }

    @Override
    public void delete(int id) {
        userMapper.delete(id);

    }

}
