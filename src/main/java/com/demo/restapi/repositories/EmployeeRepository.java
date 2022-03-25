package com.demo.restapi.repositories;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository {

    List<Map<String,Object>> getAllEmployees();
    List<Map<String,Object>> getEmployeeById(int employeeid);
}
