package com.container;

import com.model.IApplicant;
import com.utilities.IApplication;
import com.logic.IBusinessLogic;
import com.logic.BusinessLogic;
import com.model.*;
import com.utilities.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Configuration {

    public static IApplication createApplication(){
        return new Application(configureBusinessLogic());
    }

    private static IBusinessLogic configureBusinessLogic() {
        return new BusinessLogic(getApplicants(), createEmployeeList());
    }

    private static ArrayList<Employee> createEmployeeList() {
        return new ArrayList<>();
    }

    private static List<IApplicant> getApplicants() {
        return Arrays.asList(new Scientist("Lionel", "Messi"), new Manager("Rafa", "Nadal"),
                new Executive("Cristiano", "Ronaldo"), new Technician("Tiger", "Woods"), new Designer("Zinedine", "Zidane"));
    }
}
