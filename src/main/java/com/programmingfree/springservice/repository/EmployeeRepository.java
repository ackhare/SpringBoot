package com.programmingfree.springservice.repository;

import com.programmingfree.springservice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by gkatzioura on 6/2/16.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>, EmployeeRepositoryCustom {
}
