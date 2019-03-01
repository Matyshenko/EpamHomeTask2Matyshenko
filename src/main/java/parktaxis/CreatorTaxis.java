package parktaxis;

import car.cartypes.Car;
import car.spetification.Color;

import java.util.List;

public class CreatorTaxis extends TaxisPark {


    public CreatorTaxis(String name, List<Car> cars, int costOfTaxisPark) { // Вернутся к этому и сделать
        super(name, cars, costOfTaxisPark);
    }

    public CreatorTaxis() {
    }

    public void creatorPlaceOfTaxi(String[] modelsOfCar, Color[] color, int[] priceOfCars, int[] carLoadCapacity, int[] numberOfPassangerSeats) {
        CreatorTaxis creatorTaxis = new CreatorTaxis();
        try {
            for (int i = 0; i < modelsOfCar.length; i++) {
                Car creatorCars = new Car(modelsOfCar[i], color[i], priceOfCars[i], carLoadCapacity[i], numberOfPassangerSeats[i]);
                creatorTaxis.addCars(creatorCars);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addCars(Car newCars) {
        cars.add(newCars);
        System.out.println("Taxis: " + newCars);
    }

}



//    public void creatorPlaceOfTaxi(String[] modelsOfCar, Color[] color, int[] priceOfCars, int[] carLoadCapacity, int[] numberOfPassangerSeats) {
//        CreatorTaxis creatorTaxis = new CreatorTaxis();
//        try {
//            for (int i = 0; i < modelsOfCar.length; i++) {
//                Car creatorCars = new Car(modelsOfCar[i], color[i], priceOfCars[i], carLoadCapacity[i], numberOfPassangerSeats[i]);
//                creatorTaxis.addCars(creatorCars);
//            }
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//    }
