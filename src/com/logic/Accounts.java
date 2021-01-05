package com.logic;

import com.model.EmployeeCategory;
import com.model.IApplicant;
import com.model.Employee;

public class Accounts {

    public Employee create(IApplicant person) {
        Employee employeeModel = new Employee();
        employeeModel.setFirstName(person.getFirstName());
        employeeModel.setLastName(person.getLastName());

        switch (person.getClass().getSimpleName()) {
            case "Executive" -> {
                employeeModel.setEmail(person.getFirstName().charAt(0) + person.getLastName() + "@executive.email.de");
                employeeModel.setEmployeeCategory(EmployeeCategory.EXECUTIVE);
            }
            case "Scientist" -> {
                employeeModel.setEmail(person.getFirstName().charAt(0) + person.getLastName() + "@scientist.email.de");
                employeeModel.setEmployeeCategory(EmployeeCategory.SCIENTIST);
            }
            case "Designer" -> {
                employeeModel.setEmail(person.getFirstName().charAt(0) + person.getLastName() + "@designer.email.de");
                employeeModel.setEmployeeCategory(EmployeeCategory.DESIGNER);
            }
            case "Manager" -> {
                employeeModel.setEmail(person.getFirstName().charAt(0) + person.getLastName() + "@manager.email.de");
                employeeModel.setEmployeeCategory(EmployeeCategory.MANAGER);
            }
            default -> {
                employeeModel.setEmail(person.getFirstName().charAt(0) + person.getLastName() + "@technician.email.de");
                employeeModel.setEmployeeCategory(EmployeeCategory.TECHNICIAN);
            }
        }

        return employeeModel;
    }
}
