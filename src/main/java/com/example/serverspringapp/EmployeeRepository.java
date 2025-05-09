package com.example.serverspringapp;

import com.example.serverspringapp.Model.Employee.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employees, Long> {

}
