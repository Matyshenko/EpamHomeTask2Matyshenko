package util.spliter;
// Создать класс tools CarService и там реализовать логику
import static util.validator.RunnerDataValidator.unsplitedStringForModel;
import static util.validator.RunnerDataValidator.unsplitedStringForPrice;
import static util.validator.RunnerDataValidator.unsplitedStringForCarLoadCapacity;
import static util.validator.RunnerDataValidator.unsplitedStringForNumberOfPassangers;

public class RunnerSplitedString {

    private LineSplitable lineSplitable = new SpliterString();

    public String[] splitedStringForModel() { // нарушение инкопсуляции
        return lineSplitable.split(unsplitedStringForModel);
    }

    public String[] splitedStringForPrice() {
        return lineSplitable.split(unsplitedStringForPrice);
    }

    public String[] splitedStringForLoadCapacity() {
        return lineSplitable.split(unsplitedStringForCarLoadCapacity);
    }

    public String[] splitedStringForNumberOfPassangers() {
        return lineSplitable.split(unsplitedStringForNumberOfPassangers);

    }

}
