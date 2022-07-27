package com.ssi.vo;

import com.ssi.entity.Department;

import java.util.List;

public class EmployeeVO {

    private String name;
    private List<Department> departments;
    private Double salary;

    public EmployeeVO() {

    }

    public EmployeeVO(String name, List<Department> departments, Double salary) {
        this.name = name;
        this.departments = departments;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
