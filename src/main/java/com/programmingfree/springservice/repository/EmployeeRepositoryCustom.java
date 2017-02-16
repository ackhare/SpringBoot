package com.programmingfree.springservice.repository;

import com.programmingfree.springservice.entity.Employee;

import java.util.List;

/**
 * Created by gkatzioura on 6/3/16.
 */
public interface EmployeeRepositoryCustom {

    List<Employee> getFirstNamesLikeAndBonusBigger(String firstName, Double bonusAmount);

}
