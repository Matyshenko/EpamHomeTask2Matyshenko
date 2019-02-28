package car.cartypes;

import car.spetification.Color;

public class CargoTaxi extends Car {
    public CargoTaxi() {
    }

    public CargoTaxi(String model, Color color, int price, int carLoadCapacity, int numberOfPassengerSeats) {
        super(model, color, price, carLoadCapacity, numberOfPassengerSeats);
    }
}
