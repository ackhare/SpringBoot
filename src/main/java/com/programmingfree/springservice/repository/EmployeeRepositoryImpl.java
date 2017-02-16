package com.programmingfree.springservice.repository;

import com.programmingfree.springservice.entity.Employee;
import com.programmingfree.springservice.entity.Task;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by gkatzioura on 6/3/16.
 */
@Repository
@Transactional(readOnly = true)
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Employee> getFirstNamesLikeAndBonusBigger(String firstName, Double bonusAmount) {

        Query query = entityManager.createNativeQuery("select * from task_list where task_id=1",Task.class);
        System.out.println("mmmmmmm");
        System.out.println(query.getSingleResult());


        return null;
    }
}
