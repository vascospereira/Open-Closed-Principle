package com.logic;

import com.model.IApplicant;
import com.model.Employee;

import java.util.List;

public class BusinessLogic implements IBusinessLogic {

    private final List<IApplicant> applicants;
    private final List<Employee> employees;

    public BusinessLogic(List<IApplicant> applicants, List<Employee> employees) {
        this.applicants = applicants;
        this.employees = employees;
    }

    @Override
    public void processData() {
        for (IApplicant person : applicants){
            employees.add(person.getAccountsProcessor().create(person));
        }

        for (Employee employee : employees){
            System.out.println(employee.getFirstName() + " " + employee.getLastName() + ": " + employee.getEmail().toLowerCase() +
                    " is " + employee.getEmployeeCategory().toString().toLowerCase());
        }
    }
}
