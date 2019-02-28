package car.cartypes;


import car.spetification.Color;

public class PassengerTaxi extends Car {
    public PassengerTaxi() {
    }

    public PassengerTaxi(String model, Color color, int price, int carLoadCapacity, int numberOfPassengerSeats) {
        super(model, color, price, carLoadCapacity, numberOfPassengerSeats);
    }
}
