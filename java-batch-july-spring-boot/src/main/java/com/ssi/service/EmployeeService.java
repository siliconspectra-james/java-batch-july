package com.ssi.service;

import com.ssi.dao.DepartmentDao;
import com.ssi.dao.EmployeeDao;
import com.ssi.entity.Department;
import com.ssi.entity.Employee;
import com.ssi.exception.NotFoundException;
import com.ssi.utils.DatabaseUtils;
import com.ssi.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {


    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    public List<EmployeeVO> getAllEmployee() throws Exception {
        List<EmployeeVO> employeeVOS = new ArrayList<>();
        for (Map.Entry<Integer, Employee> entry : DatabaseUtils.map.entrySet()) {
            employeeVOS.add(getEmployeeById(entry.getKey()));
        }
        return employeeVOS;
    }

    public EmployeeVO getEmployeeById(Integer id) throws NotFoundException {
        Employee e = employeeDao.getEmployee(id);
        if(e == null) {
            throw new NotFoundException("employee");
        }

        List<Integer> departmentIDs = e.getDepartments();
        List<Department> departments = new ArrayList<>();
        for (Integer depID : departmentIDs) {
            departments.add(departmentDao.getDepartmentById(depID));
        }
        EmployeeVO employeeVO = new EmployeeVO(e.getName(),departments,e.getSalary());
        return employeeVO;
    }

    public Employee saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
        return employee;
    }

    public Employee updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }

    public Integer deleteEmployee(Integer id) {
        return employeeDao.deleteEmployee(id);
    }

//    public List<EmployeeVO> getAllEmployee() {
//        return employeeDao.getAllEmployee();
//    }
}
