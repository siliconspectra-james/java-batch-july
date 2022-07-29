package com.ssi.dao;

import com.ssi.entity.Employee;
import com.ssi.utils.DatabaseUtils;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Repository
public class EmployeeDao {
    public Employee saveEmployee(Employee e) {
        DatabaseUtils.map.put(e.getId(), e);

        return e;
    }


    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        for (Map.Entry<Integer, Employee> e : DatabaseUtils.map.entrySet()) {
            employees.add(e.getValue());
        }
        return employees;
    }

    public Employee getEmployee(Integer id) {

        return DatabaseUtils.map.get(id);
    }

    public Employee updateEmployee(Employee e) {
        DatabaseUtils.map.put(e.getId(), e);
        return e;

    }

    public Integer deleteEmployee(Integer id) {
        DatabaseUtils.map.remove(id);
        return id;

    }
}
