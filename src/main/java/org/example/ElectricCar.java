package org.example;
public class ElectricCar extends ACar
{
    int batteryCapacity;
    int maxRange;

    int getBatteryCapacityKWh() // returns the battery capacity in kilowatt-hours
    {
        return 0;
    }
    int getMaxRangeKm() // returns the maximum range in kilometres
    {
        return 0;
    }

    int getWhPrKm() // returns the power consumption in waa hours per driven kilometre
    {
        return 0;
    }

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
