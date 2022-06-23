package com.StefanProject.SpringBoot.web.app.Service;


import com.StefanProject.SpringBoot.web.app.Model.Entity.Employee;
import com.StefanProject.SpringBoot.web.app.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> optEmployee = employeeRepository.findById(id);
        Employee employee = null;
        if(optEmployee.isPresent()){
            employee = optEmployee.get();
        }else {
            throw new RuntimeException("Employee not found for a ID ::" + id);
        }
        return  employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }
}
