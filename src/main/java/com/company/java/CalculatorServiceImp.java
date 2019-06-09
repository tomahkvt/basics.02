package com.company.java;

import com.google.inject.Inject;
import java.util.logging.Logger;

class CalculatorServiceImp implements CalculatorService{
    @Inject
    private Logger logger;

    @Inject
    public CalculatorServiceImp(Logger logger){
        this.logger = logger;
        this.logger.info("Constructor CalculatorServiceImp");
    }

    public double add(double input1, double input2) {
        logger.info("Input parameters input1:" + input1 + " , input2:" + input2);
        return input1 + input2;
    }

    public double subtract(double input1, double input2) {
        logger.info("Input parameters input1:" + input1 + " , input2:" + input2);
        return input1 - input2;
    }

    public double multiply(double input1, double input2){
        logger.info("Input parameters input1:" + input1 + " , input2:" + input2);
        return input1 * input2;
    }

    public double divide(double input1, double input2){
        logger.info("Input parameters input1:" + input1 + " , input2:" + input2);
        return input1/input2;
    }
}
