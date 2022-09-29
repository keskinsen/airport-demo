package com.definex.tddunit;

public class Airport {
    public static void main(String[] args){
        FlightClass firstClass = new FlightClass("1","First");
        FlightClass secondClass = new FlightClass("2","Second");

        Passenger Uzay = new Passenger("Uzay",true);
        Passenger Derin = new Passenger("Derin", false);

        firstClass.addPassenger(Uzay);
        firstClass.removePassenger(Uzay);
        firstClass.addPassenger(Derin);
        secondClass.addPassenger(Derin);
        secondClass.removePassenger(Derin);

        System.out.println("First flight passenger list:");
        for (Passenger passenger: firstClass.getPassengerList()){
            System.out.println(passenger.getName());

        }
        System.out.println("Second flight passenger list:");
        for (Passenger passenger: secondClass.getPassengerList()){
            System.out.println(passenger.getName());

        }



    }
}
