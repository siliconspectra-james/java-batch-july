package com.ssi.controller;


import com.ssi.entity.Employee;
import com.ssi.service.EmployeeService;
import com.ssi.vo.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


//    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @GetMapping("/get")
    public EmployeeVO getEmployeeById(@RequestParam Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee e) {
        return employeeService.saveEmployee(e);
    }

    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee e) {
        return employeeService.updateEmployee(e);
    }

    @DeleteMapping("/delete/{id}")
    public EmployeeVO deleteEmployee(@PathVariable Integer id) {
        EmployeeVO employeeVO = employeeService.getEmployeeById(id);
        employeeService.deleteEmployee(id);
        return employeeVO;
    }
}
