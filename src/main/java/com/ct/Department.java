package com.ct;

import java.util.HashSet;
import java.util.Set;

public class Department {

    private String name;

    //this avoids an NPE when getEmployees()
    private Set<Employee> employees = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
