package car.cartypes;

import car.spetification.ArraysOfColors;
import parktaxis.CreatorTaxis;
import util.parser.RunnerParser;
import util.spliter.RunnerSplitedString;

public class RunnerCar {


    public void createCar(RunnerSplitedString runnerSplitedString, ArraysOfColors arraysOfColors, RunnerParser runnerParser) {
        CreatorTaxis creatorTaxis = new CreatorTaxis();
        creatorTaxis.creatorPlaceOfTaxi(runnerSplitedString.splitedStringForModel(), arraysOfColors.addColorsForArray(), runnerParser.parserDataPrice(), runnerParser.parserDataLoadCapacity(), runnerParser.parserDataNumberOfPassangers());

    }

}
