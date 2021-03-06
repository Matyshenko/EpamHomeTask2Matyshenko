package util.parser;

import util.spliter.RunnerSplitedString;

public class RunnerParser {
    IntegerParsable integerParsable = new ParsedInteger();
    RunnerSplitedString runnerSplitedString = new RunnerSplitedString();

    public int[] parserDataPrice() {
        int[] priceOfCars = integerParsable.parsStringToInteger(runnerSplitedString.splitedStringForPrice());
        int summ = 0;
        for (int i = 0; i < priceOfCars.length; i++) {
            summ += priceOfCars[i];

        }
        System.out.println("Цена всех авто: " + summ); //убрать и переписать
        return priceOfCars;
    }

    public int[] parserDataLoadCapacity() {
        int[] carLoadCapacity = integerParsable.parsStringToInteger(runnerSplitedString.splitedStringForLoadCapacity());
        return carLoadCapacity;
    }

    public int[] parserDataNumberOfPassangers() {
        int[] numberOfPassangers = integerParsable.parsStringToInteger(runnerSplitedString.splitedStringForNumberOfPassangers());
        return numberOfPassangers;
    }

}
