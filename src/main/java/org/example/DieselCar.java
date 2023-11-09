package org.example;

public class DieselCar extends AFuelCar {

   private boolean particleFilter;

    DieselCar(int kmPrLitre, boolean particleFilter,String registrationNumber, String make, String model, int numberOfDoors) {
        super(kmPrLitre,registrationNumber,make,model,numberOfDoors);
        this.particleFilter = particleFilter;
    }


    boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    String getFuelType() {
        return "diesel";
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee = 0;

        if (particleFilter == false) {
            registrationFee += 1000;
        }

        if (getKmPrLitre() <= 5) {
            registrationFee += 10470 + 15260;
        } else if (getKmPrLitre() <= 10) {
            registrationFee += 5500 + 2770;
        } else if (getKmPrLitre() <= 15) {
            registrationFee += 2340 + 1850;
        } else if (getKmPrLitre() <= 20) {
            registrationFee += 1050 + 1390;
        } else if (getKmPrLitre() > 20) {
            registrationFee += 330 + 130;
        }
        return registrationFee;
    }
    public String toString()
    {
        return  super.toString() + "\n" + "Fuel type: " + getFuelType() + "\n" + "Registration Fee: " + getRegistrationFee() + "\n" + "Has Particle Filter: " + hasParticleFilter() + "\n";
    }
}
