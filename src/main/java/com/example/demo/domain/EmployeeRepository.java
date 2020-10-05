/**
 *
 */
package com.example.demo.domain;

import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository {
    Optional<Employee> findOneById(String employeeId);
}
