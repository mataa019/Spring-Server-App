package com.example.serverspringapp.controller;

import com.example.serverspringapp.EmployeeService;
import com.example.serverspringapp.Model.Employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
@GetMapping("/employee/get-all")
    public List<Employee> getAllEmployee(){
    return employeeService.getAllEmployee();
}
}
