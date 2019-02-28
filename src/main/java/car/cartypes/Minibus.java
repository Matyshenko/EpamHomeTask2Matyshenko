package car.cartypes;

import car.spetification.Color;

public class Minibus extends Car {


    public Minibus() {
    }

    public Minibus(String model, Color color, int price, int carLoadCapacity, int numberOfPassengerSeats) {
        super(model, color, price, carLoadCapacity, numberOfPassengerSeats);
    }
}
