package com.model;

import com.logic.Accounts;

public interface IApplicant {
    Accounts getAccountsProcessor();

    String getFirstName();

    String getLastName();
}
