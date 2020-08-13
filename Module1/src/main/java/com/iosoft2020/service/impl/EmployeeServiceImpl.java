package com.iosoft2020.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iosoft2020.entity.Employee;
import com.iosoft2020.mapper.EmployeeMapper;
import com.iosoft2020.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAll() {
        return employeeMapper.getAll();
    }

    @Override
    public void save(Employee employee) {
        employeeMapper.save(employee);

    }

    @Override
    public Employee getById(int id) {
        return employeeMapper.getById(id);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.update(employee);

    }

    @Override
    public void delete(int id) {
        employeeMapper.delete(id);

    }

}
