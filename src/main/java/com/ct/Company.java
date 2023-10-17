package com.ct;

import java.time.LocalDate;
import java.util.Set;

public class Company {
    //3 are essential, can't be skipped
    private String name;

    private int yearEstablished;

    private State state;

    private Employee ceo;

    private Employee cfo;

    private Set<Department> departments;

    public Company() {

    }

    public Company(String name, int yearEstablished, State state) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.state = state;
    }

    //these are called factory methods, or static constructors
    //specifically call out some "preferred" way to instantiate this class
    public static Company of(String name, int yearEstablished, State state) {
        //return new Company(name, yearEstablished, state);
        var company = new Company();
        company.setName(name);
        company.setState(state);
        company.setYearEstablished(yearEstablished);
        return company;
    }

    public static Company with(String name, int yearEstablished, State state) {
        //return new Company(name, yearEstablished, state);
        var company = new Company();
        company.setName(name);
        company.setState(state);
        company.setYearEstablished(yearEstablished);
        return company;
    }

    public static Company withDefaults() {
        //return new Company(name, yearEstablished, state);
        var company = new Company();
        company.setYearEstablished(LocalDate.now().getYear());
        return company;
    }



    //this is a method not function
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Employee getCeo() {
        return ceo;
    }

    public void setCeo(Employee ceo) {
        this.ceo = ceo;
    }

    public Employee getCfo() {
        return cfo;
    }

    public void setCfo(Employee cfo) {
        this.cfo = cfo;
    }

    public Set<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
