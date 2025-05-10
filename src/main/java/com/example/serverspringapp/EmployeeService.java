package com.example.serverspringapp;

import com.example.serverspringapp.Model.Employee.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public void save(Employees employees){
         repository.save(employees);
    }
    public void detel(Employees employees){
        repository.delete(employees);
    }
}
