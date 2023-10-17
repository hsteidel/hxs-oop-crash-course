package com.ct;

import java.util.Set;

public class CompanyWithFinals {
    //3 are essential, can't be skipped
    private final String name;

    private final int yearEstablished;

    private final State state;

    private Employee ceo;

    private Employee cfo;

    private Set<Employee> employees;

    //constructor
    private CompanyWithFinals() {
        //default constructor
        yearEstablished = 0;
        name = "";
        state = State.FL;
    }

    public CompanyWithFinals(String name, int yearEstablished, State state) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.state = state;
    }


    //this is a method not function
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //this is not valid because it's final
        //this.name = name;
    }
}
