package com.ssi.controller;

import com.google.gson.Gson;
import com.ssi.entity.Department;
import com.ssi.entity.Employee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class GetEmployeeController extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        List<Department> departments = new ArrayList<>();
        departments.add(new Department(03, "IT"));
        departments.add(new Department(04, "Sales"));
        Employee employee = new Employee(Integer.valueOf(id), "Mike", departments, 5000d);
        Gson gson = new Gson();
        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        out.print(gson.toJson(employee));
        out.flush();
    }
}
