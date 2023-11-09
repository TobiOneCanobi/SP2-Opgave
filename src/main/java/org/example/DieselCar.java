package org.example;
public class DieselCar extends AFuelCar
{

    boolean particleFilter;

    @Override
    String getFuelType() {
        return null;
    }

    @Override
    int getKmPrLitre() {
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

    boolean hasParticleFilter()
    {
        return particleFilter;
    }
}
