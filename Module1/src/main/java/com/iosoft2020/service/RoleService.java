package com.iosoft2020.service;

import java.util.List;

import com.iosoft2020.entity.Role;

public interface RoleService {

    public List<Role> getAll();

    public void save(Role role);

    public void update(Role role);

    public Role getById(int id);

    public void delete(int id);

}
