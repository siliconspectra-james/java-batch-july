package com.ssi.controller;


import com.ssi.exception.NotFoundException;
import com.ssi.service.EmployeeService;
import com.ssi.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/get")
    public List<EmployeeVO> getAllEmployee() throws Exception {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/get/{id}")
    public EmployeeVO getEmployeeByID(@PathVariable Integer id) throws NotFoundException {
        return employeeService.getEmployeeById(id);
    }
}
