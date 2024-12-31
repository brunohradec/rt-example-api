package com.example.rt_example_api.mappers;

import com.example.rt_example_api.dto.EmployeeDto;
import com.example.rt_example_api.model.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    EmployeeDto toDto(Employee employee);
}
