package car.cartypes;

import car.spetification.Color;

public class Car {
    private String model;
    private Color color;
    private int price;
    private int carLoadCapacity;
    private int numberOfPassengerSeats;

    public Car() {
    }

    public Car(String model, Color color, int price, int carLoadCapacity, int numberOfPassengerSeats) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.carLoadCapacity = carLoadCapacity;
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCarLoadCapacity() {
        return carLoadCapacity;
    }

    public void setCarLoadCapacity(int carLoadCapacity) {
        this.carLoadCapacity = carLoadCapacity;
    }

    public int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }

    public void setNumberOfPassengerSeats(int numberOfPassengerSeats) {
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }
}
