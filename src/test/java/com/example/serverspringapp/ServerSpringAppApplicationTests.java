package com.example.serverspringapp;

import com.example.serverspringapp.Model.Employee.Employees;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServerSpringAppApplicationTests {
     @Autowired
     private EmployeeService employeeService;

     @Test
     void addEmployee(){
         Employees employees = new Employees();
         employees.setName("John Mataa");
         employees.setLocation("Lusaka");
         employees.setBranch("IT");
         employeeService.save(employees);
     }
    @Test
    void contextLoads() {
    }

}
