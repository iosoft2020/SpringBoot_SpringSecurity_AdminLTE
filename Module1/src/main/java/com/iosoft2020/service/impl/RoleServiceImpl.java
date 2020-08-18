package com.iosoft2020.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iosoft2020.entity.Role;
import com.iosoft2020.mapper.RoleMapper;
import com.iosoft2020.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getAll() {
        return roleMapper.getAll();
    }

    @Override
    public void save(Role role) {
        roleMapper.save(role);

    }

    @Override
    public Role getById(int id) {
        return roleMapper.getById(id);
    }

    @Override
    public void update(Role role) {
        roleMapper.update(role);

    }

    @Override
    public void delete(int id) {
        roleMapper.delete(id);

    }
}
