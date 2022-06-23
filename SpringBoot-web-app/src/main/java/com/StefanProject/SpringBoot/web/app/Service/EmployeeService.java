package com.StefanProject.SpringBoot.web.app.Service;

import com.StefanProject.SpringBoot.web.app.Model.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);
}
