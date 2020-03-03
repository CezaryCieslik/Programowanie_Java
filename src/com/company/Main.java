package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {

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
        cleanOne.setPlates("GDA41");


        me.setCar(cleanOne);

        Human wife = new Human();
        wife.firstName = "Zła";
        wife.lastName = "Kobieta";
        wife.riseMySalary();
        wife.setCar(me.getCar());

        System.out.println(wife.getCar().getPlates());
        System.out.println(me.getCar().getPlates());

        System.out.println(me.getCar());
        System.out.println(wife.getCar());

        System.out.println(me);
        System.out.println(wife);

        System.out.println(me.getSalary());

        wife.feed();
        me.takeForAWalk();
        System.out.println(me.species);
    }
}
