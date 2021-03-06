package com.iosoft2020.mapper;

import java.util.List;

import com.iosoft2020.entity.Department;

public interface DepartmentMapper {

    public List<Department> getAll();

    public Department getById(int id);

    public void save(Department department);

    public void update(Department department);

    public void delete(int id);
}
