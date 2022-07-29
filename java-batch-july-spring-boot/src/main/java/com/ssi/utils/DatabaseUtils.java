package com.ssi.utils;

import com.ssi.entity.Department;
import com.ssi.entity.Employee;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DatabaseUtils {
    public static Map<Integer, Employee> map = new ConcurrentHashMap<>();
    public static Map<Integer, Department> departmentMap = new ConcurrentHashMap<>();

    static {
        Department department1 = new Department(001,"IT");
        Department department2 = new Department(002,"Sales");
        Department department3 = new Department(003,"Finance");
        departmentMap.put(department1.getDepartmentId(),department1);
        departmentMap.put(department2.getDepartmentId(),department2);
        departmentMap.put(department3.getDepartmentId(),department3);


        Employee employee1 = new Employee(1001, "Mike", Arrays.asList(001,002),6000d);
        Employee employee2 = new Employee(1002, "Tina", Arrays.asList(002,003),5000d);
        Employee employee3 = new Employee(1003, "Howard", Arrays.asList(003),3000d);
        map.put(employee1.getId(),employee1);
        map.put(employee2.getId(),employee2);
        map.put(employee3.getId(),employee3);
    }
}
