package com.ct;


import java.time.LocalDate;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //Rekor Modeling Excerise

        //instantiation
        // this no longer works because it's private -> Company rekor1 = new Company();
        CompanyWithFinals rekor2 = new CompanyWithFinals("Rekor", 1980, State.FL);

        Company rekorMutable = new Company("Rekor", 2000, State.FL);

        Company rekorWithStaticInstantiation = Company.of("R", 1000, State.FL);

        var departments = new HashSet<Department>();
        var engineering = new Department();
        engineering.setName("eng");

        var engineeringEmployee1 = new Employee();
        var employeeOneHireDate = LocalDate.of(2020, 12, 2);
        engineeringEmployee1.setFirstName("J");
        engineeringEmployee1.setHiredOn(employeeOneHireDate);
        engineeringEmployee1.setType(EmployeeType.REGULAR);
        engineeringEmployee1.setHourlyWage(45.0);
        engineeringEmployee1.setLastName("D");
        engineering.getEmployees().add(engineeringEmployee1);
        //do the same for emp2 copy paste from above

        departments.add(engineering);


        rekorMutable.setDepartments(departments);

        System.out.println(rekorMutable);
    }
}