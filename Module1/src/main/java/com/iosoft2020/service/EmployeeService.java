package com.iosoft2020.service;

import java.util.List;

import com.iosoft2020.entity.Employee;

public interface EmployeeService {

    public List<Employee> getAll();

    public void save(Employee employee);

    public void update(Employee employee);

    public Employee getById(int id);

    public void delete(int id);

}
