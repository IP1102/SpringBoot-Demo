package com.demo.restapi.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepositoryImp implements EmployeeRepository{

    JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeRepositoryImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Map<String, Object>> getAllEmployees() {
        String sql = "select * from \"Employees\"";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public List<Map<String, Object>> getEmployeeById(int employeeid) {
        String sql = "select * from \"Employees\" where \"EmpId\" = ?";
        return jdbcTemplate.queryForList(sql,employeeid);
    }
}
