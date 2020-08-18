package com.iosoft2020.service;

import java.util.List;

import com.iosoft2020.entity.Department;

public interface DepartmentService {

    public List<Department> getAll();

    public void save(Department department);

    public void update(Department department);

    public Department getById(int id);

    public void delete(int id);

}
