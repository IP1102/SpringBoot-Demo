package com.demo.restapi.services;

import com.demo.restapi.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Map<String, Object>> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public List<Map<String, Object>> getEmployeeById(Object employeeid) {
        return employeeRepository.getEmployeeById((Integer) employeeid);
    }
}
