package com.codegym;

public class Car {

    private String name;

    private String engine;

    public static int numberOFCars;

    public Car (String name, String engine) {
        this.name = name;

        this.engine = engine;

        numberOFCars++;
    }

    //getters and setters

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
