import car.cartypes.RunnerCar;
import car.spetification.ArraysOfColors;
import parktaxis.CreatorTaxis;
import util.parser.RunnerParser;
import util.spliter.RunnerSplitedString;
import util.txtfilevalidator.RunnerTxtValidator;
import util.validator.RunnerDataValidator;

public class Main {
    public static void main(String[] args) {
        RunnerTxtValidator runnerTxtValidator = new RunnerTxtValidator();
        runnerTxtValidator.startTxtValidator();

        RunnerDataValidator runnerDataValidator = new RunnerDataValidator();
        runnerDataValidator.startValidation();

        RunnerSplitedString runnerSplitedString = new RunnerSplitedString();
        ArraysOfColors arraysOfColors = new ArraysOfColors();
        RunnerParser runnerParser = new RunnerParser();

        RunnerCar runnerCar = new RunnerCar();
        runnerCar.createCar(runnerSplitedString, arraysOfColors, runnerParser);
    }
}
