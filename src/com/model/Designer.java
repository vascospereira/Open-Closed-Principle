package com.model;

import com.logic.Accounts;

public class Designer implements IApplicant{

    private final String firstName;
    private final String lastName;
    private final Accounts accountsProcessor = new Accounts();

    public Designer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public Accounts getAccountsProcessor() {
        return accountsProcessor;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
