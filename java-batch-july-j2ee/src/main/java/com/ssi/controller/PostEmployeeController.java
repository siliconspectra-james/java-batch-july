package com.ssi.controller;

import com.google.gson.Gson;
import com.ssi.entity.Employee;
import com.ssi.service.EmployeeService;
import com.ssi.utils.ApiUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PostEmployeeController extends HttpServlet {
    EmployeeService employeeService = new EmployeeService();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Gson gson = new Gson();
        Employee e = employeeService.saveEmployee(ApiUtils.getRequestBody(req, Employee.class));
        PrintWriter out = resp.getWriter();
        resp.setContentType("application/json");
        out.print(gson.toJson(e));
        out.flush();
    }
}
