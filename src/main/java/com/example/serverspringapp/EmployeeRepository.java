package com.example.serverspringapp;
import com.example.serverspringapp.Model.Employee.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees, Long> {

}
