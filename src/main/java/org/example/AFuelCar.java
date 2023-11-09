package org.example;
abstract class AFuelCar extends ACar {

    int kmPrLitre;

    abstract String getFuelType(); // should return "Gasoline" or "Diesel"{


    int getKmPrLitre() // should return how many kilometres the car can drive on 1 litre of fuel
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return null;
    }
}
