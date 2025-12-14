package model;

import static validate.Validator.carNameValidator;

import util.RandomGenerator;


public class Car {
    private final String name;
    private String distance;

    public Car(String name) {
        carNameValidator(name);
        this.name = name;
        this.distance = "";
    }
    public void move(){
        if(RandomGenerator.isMovable()){
            distance+="=";
        }
    }

    public String getName() {
        return name;
    }

    public String getDistance() {
        return distance;
    }
}
