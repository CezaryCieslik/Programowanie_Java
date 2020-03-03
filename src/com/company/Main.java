package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";

        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();


        Car cleanOne = new Car();
        cleanOne.producer = "fiat";
        cleanOne.model = "bravo";
        cleanOne.yearOfProduction = 2015;
        cleanOne.plates = "GDA32342";


        me.car = cleanOne;

        System.out.println(me.car.plates);
    }
}
