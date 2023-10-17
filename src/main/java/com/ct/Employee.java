package com.ct;

import java.time.LocalDate;

public class Employee {

    // firstName
    private String firstName;

    // lastName
    private String lastName;

    //can be a manager or regular employee
    // unecessary instantiation
    //private String type = new EmployeeType().manager;
    private String type = EmployeeType.MANAGER;


    //can work on a Product


    //can be in a Department

    //has an hourlyWage
    private double hourlyWage = 0.0;

    //hire on date
    private LocalDate hiredOn;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public LocalDate getHiredOn() {
        return hiredOn;
    }

    public void setHiredOn(LocalDate hiredOn) {
        this.hiredOn = hiredOn;
    }
}
