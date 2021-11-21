package com.codegym;

public class TestStaticProperty {

    public static void main(String[] args) {
        Car c1= new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);

        Car c2= new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
