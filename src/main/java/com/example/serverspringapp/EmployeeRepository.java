package com.example.serverspringapp;
import com.example.serverspringapp.Model.Employee.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employees, Long> {

}
