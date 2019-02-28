package parktaxis;

import car.cartypes.Car;

import java.util.ArrayList;
import java.util.List;

public class TaxisPark {
    private String name;
    public static List<Car> cars = new ArrayList<>();
    private int costOfTaxisPark;

    public TaxisPark(String name, List<Car> cars, int costOfTaxisPark) {
        this.name = name;
        this.cars = cars;
        this.costOfTaxisPark = costOfTaxisPark;
    }

    public TaxisPark(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public int getCostOfTaxisPark() {
        return costOfTaxisPark;
    }

    public void setCostOfTaxisPark(int costOfTaxisPark) {
        this.costOfTaxisPark = costOfTaxisPark;
    }
}
