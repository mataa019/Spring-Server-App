package com.example.serverspringapp;

import com.example.serverspringapp.Model.Employee.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public void save(Employees employees){
         repository.save(employees);
    }
    public List<Employees> getAllEmployee(){
        List<Employees> employees= new ArrayList<>();
    }
    public void detele(Employees employees){
        repository.delete(employees);
    }
}
