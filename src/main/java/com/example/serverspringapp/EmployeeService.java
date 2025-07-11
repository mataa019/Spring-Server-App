package com.example.serverspringapp;

import com.example.serverspringapp.Model.Employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public void save(Employee employee){
         repository.save(employee);
    }
    public List<Employee> getAllEmployee(){
        List<Employee> employees= new ArrayList<>();
        Streamable.of(repository.findAll()).forEach(employees::add);
        return employees;
    }
    public void detele(Employee employee){
        repository.delete(employee);
    }
}
