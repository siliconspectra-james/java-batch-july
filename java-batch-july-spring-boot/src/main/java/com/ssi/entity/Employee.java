package com.ssi.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Integer id;
    private String name;
    private List<Integer> departments;
    private Double salary;

}
