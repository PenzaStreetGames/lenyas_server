package com.penzstreetstusios.lenyas_server.repository;

import com.penzstreetstusios.lenyas_server.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
