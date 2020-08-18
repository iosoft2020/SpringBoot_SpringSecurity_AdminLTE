package com.iosoft2020.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iosoft2020.entity.Department;
import com.iosoft2020.mapper.DepartmentMapper;
import com.iosoft2020.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAll() {
        return departmentMapper.getAll();
    }

    @Override
    public void save(Department department) {
        departmentMapper.save(department);

    }

    @Override
    public Department getById(int id) {
        return departmentMapper.getById(id);
    }

    @Override
    public void update(Department department) {
        departmentMapper.update(department);

    }

    @Override
    public void delete(int id) {
        departmentMapper.delete(id);

    }
}
