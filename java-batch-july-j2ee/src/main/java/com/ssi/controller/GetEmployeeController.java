package com.ssi.controller;

import com.google.gson.Gson;
import com.ssi.service.EmployeeService;
import com.ssi.vo.EmployeeVO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class GetEmployeeController extends HttpServlet {

    EmployeeService employeeService = new EmployeeService();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        EmployeeVO employee = employeeService.getEmployeeById(Integer.valueOf(id));
        Gson gson = new Gson();
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        out.print(gson.toJson(employee));
        out.flush();
    }
}
