package com.ssi.vo;

import com.ssi.entity.Department;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmployeeVO {

    private String name;
    private List<Department> departments;
    private Double salary;

}
