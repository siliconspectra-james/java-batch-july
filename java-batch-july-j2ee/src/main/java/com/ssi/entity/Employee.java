package com.ssi.entity;

import java.util.List;

public class Employee {
    private Integer id;
    private String name;
    private List<Department> departments;
    private Double salary;

    public Employee(Integer id, String name, List<Department> departments, Double salary) {
        this.id = id;
        this.name = name;
        this.departments = departments;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
