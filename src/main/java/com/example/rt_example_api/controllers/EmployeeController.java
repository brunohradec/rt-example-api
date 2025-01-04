package com.example.rt_example_api.controllers;

import com.example.rt_example_api.dto.EmployeeDto;
import com.example.rt_example_api.mappers.EmployeeMapper;
import com.example.rt_example_api.services.EmployeeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    public EmployeeController(EmployeeService employeeService, EmployeeMapper employeeMapper) {
        this.employeeService = employeeService;
        this.employeeMapper = employeeMapper;
    }

    @GetMapping
    public ResponseEntity<Page<EmployeeDto>> findAll(Pageable pageable) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(employeeService.findAllEmployees(pageable).map(employeeMapper::toDto));
    }
}
