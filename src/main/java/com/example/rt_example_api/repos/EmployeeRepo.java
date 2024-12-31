package com.example.rt_example_api.repos;

import com.example.rt_example_api.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    @Query("SELECT e FROM Employee e")
    Page<Employee> findAllEmployees(Pageable pageable);
}
