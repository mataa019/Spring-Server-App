package com.example.serverspringapp;

import com.example.serverspringapp.Model.Employee.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ServerSpringAppApplicationTests {
     @Autowired
     private EmployeeService employeeService;

     //@Test
     void addEmployee(){
         Employee employee = new Employee();
         employee.setName("Timo Simwawa");
         employee.setLocation("Kitwe");
         employeeService.save(employee);
     }
     @Test
    void DeteleAllEmployee(){
        List<Employee>employees= employeeService.getAllEmployee();
        for(Employee employee : employees){
            employeeService.detele(employee);
        }
    }

}
