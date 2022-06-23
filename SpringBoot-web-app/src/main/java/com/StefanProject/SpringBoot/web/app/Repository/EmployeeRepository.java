package com.StefanProject.SpringBoot.web.app.Repository;

import com.StefanProject.SpringBoot.web.app.Model.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {



}
