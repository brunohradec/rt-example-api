package com.example.rt_example_api.services;

import com.example.rt_example_api.model.Employee;
import com.example.rt_example_api.repos.EmployeeRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Page<Employee> findAllEmployees(Pageable pageable) {
        return employeeRepo.findAllEmployees(pageable);
    }
}
