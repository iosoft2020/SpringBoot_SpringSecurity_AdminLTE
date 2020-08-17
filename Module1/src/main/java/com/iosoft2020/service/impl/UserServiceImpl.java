package com.iosoft2020.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.iosoft2020.mapper.UserMapper;
import com.iosoft2020.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails userDetails = userMapper.findByName(username);
        if(userDetails == null){
            throw new UsernameNotFoundException(username + " not found ");
        }
        return userDetails;
    }

}
