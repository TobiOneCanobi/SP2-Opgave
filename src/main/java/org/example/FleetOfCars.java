package org.example;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();


        void addCar(Car car) {
            fleet.add(car);
        }

    int getTotalRegistrationFeeForFleet()
    {
       int totalRegistrationFeeForFleet = 0;
        for(Car i: fleet) {
            totalRegistrationFeeForFleet += i.getRegistrationFee();
        }
        
        return totalRegistrationFeeForFleet;
    }

    @Override
    public String toString() {
            StringBuilder builder = new StringBuilder();

            for(Car i: fleet){
                builder.append(i);
            }
            return builder.toString();
    }

}


