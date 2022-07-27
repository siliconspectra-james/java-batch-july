package com.ssi.service;

import com.ssi.dao.EmployeeDao;
import com.ssi.entity.Employee;
import com.ssi.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    @Autowired
    EmployeeDao employeeDao;


    public EmployeeVO getEmployeeById(Integer id) {
        Employee e = employeeDao.getEmployee(id);
        if(e == null) {
            return new EmployeeVO();
        }
        EmployeeVO employeeVO = new EmployeeVO(e.getName(),e.getDepartments(),e.getSalary());
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
