package com.definex.tddunit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightClass {

    private String id;
    private String flightType;
    private List<Passenger> passengerList = new ArrayList<Passenger>();

    public FlightClass(String id, String flightType){
        this.id = id;
        this.flightType = flightType;
    }
    public String getId(){
        return id;
    }
    public List<Passenger> getPassengerList(){
        return Collections.unmodifiableList(passengerList);
    }
    public String getFlightType() {
        return  flightType;
    }
    public boolean addPassenger(Passenger passenger){
        switch (flightType){
            case "First":
                if (passenger.isVip()) {
                    return passengerList.add(passenger);
                }
                return false;
            case "Second":
                return passengerList.add(passenger);

            default:
                throw new RuntimeException("Unknown type: " + flightType);
        }

    }
    public boolean removePassenger(Passenger passenger){
        switch (flightType) {
            case  "First":
                return false;
            case  "Second":
                if (passenger.isVip()){
                    return passengerList.remove(passenger);
                }
                return false;
            default:
                throw new RuntimeException("Unknown type:" + flightType);
        }
    }

}
