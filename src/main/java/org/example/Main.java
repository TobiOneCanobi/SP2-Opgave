package org.example;

public class main {
    public static void main(String[] args) {

       FleetOfCars fleet = new FleetOfCars();



      GasolineCar g = new GasolineCar(50,"To200502 ","audi ","a6 ",4);
      ElectricCar e = new ElectricCar(150,70,"BI290502","Tesla","Model Y",4);
      DieselCar d = new DieselCar(50,true,"AS290502","Ford","F150",4);


        fleet.addCar(g);
        fleet.addCar(e);
        fleet.addCar(d);

        System.out.println(fleet);
    }


}
