package com.utilities;

import com.logic.IBusinessLogic;

public class Application implements IApplication {
    IBusinessLogic businessLogic;

    public Application(IBusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }

    @Override
    public void run() {
        businessLogic.processData();
    }
}
