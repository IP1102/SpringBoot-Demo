package com.demo.restapi.services;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    List<Map<String,Object>> getAllEmployees();
    List<Map<String,Object>> getEmployeeById(Object employeeid);
}
