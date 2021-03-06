package com.programmingfree.springservice.controller;


import com.programmingfree.springservice.entity.Employee;
import com.programmingfree.springservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by gkatzioura on 6/2/16.
 */
/*
 @RestController, meaning it’s ready for use by Spring MVC to handle web requests.
  @RequestMapping maps / to the index() method. When invoked from a browser or using curl on the command line,
  the method returns pure text.
  That’s because @RestController combines @Controller and @ResponseBody,
   two annotations that results in web requests returning data rather than a view.

 */
@RestController
public class TestController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping("/employee")
    public List<Employee> getTest() {

        return employeeRepository.findAll();
    }

    @RequestMapping("/employee/filter")
    public List<Employee> getFiltered(String firstName,@RequestParam(defaultValue = "0") Double bonusAmount) {

        return employeeRepository.getFirstNamesLikeAndBonusBigger(firstName,bonusAmount);
    }

}
