package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String department;
    private Boolean isFullTame;
    private Double salary;


    public Employee(String name, String department, Boolean isFullTame, Double salary) {
        this.name = name;
        this.department = department;
        this.isFullTame = isFullTame;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getFullTame() {
        return isFullTame;
    }

    public void setFullTame(Boolean fullTame) {
        isFullTame = fullTame;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    List<Employee> list;

    Map<Boolean,List<Employee>> fullTime = list.stream().filter(e->e.department.isEmpty()).collect(Collectors.partitioningBy(Employee::getFullTame));
}


