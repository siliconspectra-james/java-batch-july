package com.ssi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
//        Employee e1 = (Employee) context.getBean("employee1");
//        Employee e2 = (Employee) context.getBean("employee1");
//        System.out.println(e1 == e2);

        //Employee e1 = (Employee) context.getBean("employee1");
        Employee e1 = context.getBean(Employee.class);
        System.out.println(e1);
    }
}
