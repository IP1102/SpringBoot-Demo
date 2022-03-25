package com.demo.restapi.controllers;

import com.demo.restapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getallemployees")
    public ResponseEntity<List<Map<String,Object>>> getAllEmployees(){

        List<Map<String,Object>> respBody = employeeService.getAllEmployees();

        return new ResponseEntity<>(respBody, HttpStatus.OK);
    }

    @GetMapping("/getemployeebyid")
    public ResponseEntity<List<Map<String,Object>>> getEmployeeById(@RequestBody Map<String,Object> reqBody){
        Object employeeid = reqBody.get("EmployeeId");
        List<Map<String,Object>> respBody = employeeService.getEmployeeById(employeeid);
        return new ResponseEntity<>(respBody,HttpStatus.OK);
    }


}
