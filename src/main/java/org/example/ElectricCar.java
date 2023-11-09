package org.example;

public class ElectricCar extends ACar {
   private int batteryCapacity;
   private int maxRange;



    ElectricCar(int maxRange, int batteryCapacity,String registrationNumber, String make, String model, int numberOfDoors) {
        super(registrationNumber, make, model, numberOfDoors);
        this.maxRange = maxRange;
        this.batteryCapacity = batteryCapacity;
    }

    int getBatteryCapacityKWh() // returns the battery capacity in kilowatt-hours
    {
        return batteryCapacity;
    }

    int getMaxRangeKm() // returns the maximum range in kilometres
    {
        return maxRange;
    }

    int getWhPrKm() // returns the power consumption in watt-hours per driven kilometre
    {
        int wattPerKilometers = (batteryCapacity*1000) / maxRange;
        return  wattPerKilometers;
    }

    @Override
    public int getRegistrationFee() {

       double wattHourPrKmToKmPrLiter = (getWhPrKm() /91.25);
       double kmPrLitre = 100/wattHourPrKmToKmPrLiter;

        int registrationFee = 0;
        if (kmPrLitre < 5) {
            registrationFee += 10470;
        } else if (kmPrLitre <= 10) {
            registrationFee += 5500;
        } else if (kmPrLitre <= 15) {
            registrationFee += 2340;
        } else if (kmPrLitre <= 20) {
            registrationFee += 1050;
        } else if (kmPrLitre > 20) {
            registrationFee += 330;
        }
        return registrationFee;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Battery Capacity in KWh: " + getBatteryCapacityKWh() + "\n" + "Max Range in Km: " + getMaxRangeKm() + "\n" + "Registration Fee: " + getRegistrationFee() + "\n" + "Watt hours per driven Km: " + getWhPrKm() + "\n";
    }
}
