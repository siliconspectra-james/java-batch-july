package com.ssi.fin;

//how to write/define a final class
//use final keyword on class
public final class  Employee {

    //use final keyword on var
    private final String name;
    private final Integer age;

    //initilize var in constructor
    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //add get method no set method
    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Mike", 25);
        System.out.println(employee);
    }
}
