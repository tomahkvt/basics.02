package com.company.java;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.logging.Logger;

public class MathApplicationMain {
    public static void main(String [] args){
        Injector injector = Guice.createInjector(new MathApplicationModule());
        MathApplication mathApplication = injector.getInstance(MathApplication.class);
        System.out.println(mathApplication.add(1,2));
    }
}

//Binding Module
class MathApplicationModule extends AbstractModule {
    @Override

    protected void configure() {
        bind(CalculatorService.class).to(CalculatorServiceImp.class);
    }
}

