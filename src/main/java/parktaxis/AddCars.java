package parktaxis;

import car.cartypes.Car;
import car.cartypes.PassengerTaxi;

import static parktaxis.TaxisPark.cargoCars;
import static parktaxis.TaxisPark.passangerCars;

public class AddCars {

    public void addPassangerCars(Car newCars) {
        passangerCars.add(newCars);
        System.out.println("Passanger cars: " + newCars);
    }

    public void addCargoCars(Car newCars) {
        cargoCars.add(newCars);
        System.out.println("Cargo cars: " + newCars);
    }

    public void addMiniBus(Car newCars) {
        cargoCars.add(newCars);
        System.out.println("Mini bus: " + newCars);
    }


}
