import car.spetification.ArraysOfColors;
import parktaxis.CreatorTaxis;
import util.inputfiles.CreateFiles;
import util.inputfiles.FileCreatable;
import util.parser.IntegerParsable;
import util.parser.ParsedInteger;
import util.reader.DataReadFile;
import util.reader.DataReader;
import util.reader.WrongFileExaprion;
import util.spliter.SplitLine;
import util.spliter.SpliterString;
import util.txtfilevalidator.TxtFileValidator;
import util.txtfilevalidator.ValidateTxt;
import util.validator.DataValidator;
import util.validator.IntegerDataValidator;
import util.validator.StringDataValidator;

public class Main {
    public static void main(String[] args) throws WrongFileExaprion {
        FileCreatable createFiles = new CreateFiles();

        ValidateTxt validateTxt = new TxtFileValidator(); // Создание объекта класса, который проверят расширение файла
        validateTxt.validateFile(createFiles.loadModelForTaxi());
        validateTxt.validateFile(createFiles.loadPriceForTaxi());
        validateTxt.validateFile(createFiles.loadCarLoadCapacity());
        validateTxt.validateFile(createFiles.numberOfPassanger());

        DataReadFile dataReadFile = new DataReader();

        DataValidator dataValidatorForString = new StringDataValidator();
        DataValidator dataValidatorForInteger = new IntegerDataValidator();

        String unsplitedStringForModel = "";
        try {
            unsplitedStringForModel = dataReadFile.fileRaderString(createFiles.loadModelForTaxi(), dataValidatorForString);
        } catch (WrongFileExaprion e) {
            throw new WrongFileExaprion("File wrong", e);
        }

        String unsplitedStringForPrice = "";

        String unsplitedStringForCarLoadCapacity = "";

        String unsplitedStringForNumberOfPassangers = "";

        unsplitedStringForPrice = dataReadFile.fileRaderString(createFiles.loadPriceForTaxi(), dataValidatorForInteger); // изменить дату
        System.out.println("Цифры: " + unsplitedStringForPrice); // удалить потом

        unsplitedStringForCarLoadCapacity = dataReadFile.fileRaderString(createFiles.loadCarLoadCapacity(), dataValidatorForInteger); // изменить дату

        System.out.println("Загрузка: " + unsplitedStringForCarLoadCapacity); // удалить потом

        unsplitedStringForNumberOfPassangers = dataReadFile.fileRaderString(createFiles.numberOfPassanger(), dataValidatorForInteger);
        System.out.println("Passagers: " + unsplitedStringForNumberOfPassangers); // удалить потом


        SplitLine splitLine = new SpliterString();
        splitLine.split(unsplitedStringForModel);
        splitLine.split(unsplitedStringForCarLoadCapacity);
        splitLine.split(unsplitedStringForNumberOfPassangers);

        System.out.println("Массив строк: " + unsplitedStringForModel); // удалить потом

        CreatorTaxis creatorTaxis = new CreatorTaxis();

        IntegerParsable integerParsable = new ParsedInteger();
        integerParsable.parsStringToInteger(splitLine.split(unsplitedStringForPrice));
        integerParsable.parsStringToInteger(splitLine.split(unsplitedStringForCarLoadCapacity));
        integerParsable.parsStringToInteger(splitLine.split(unsplitedStringForNumberOfPassangers));


        String[] arrayOfIntegerPrice = splitLine.split(unsplitedStringForPrice);
        String[] arrayOfIntegerCarLoadCapacity = splitLine.split(unsplitedStringForCarLoadCapacity);
        String[] arrayOfIntererNumberOfPassangers = splitLine.split(unsplitedStringForNumberOfPassangers);

        int[] priceOfCars = integerParsable.parsStringToInteger(arrayOfIntegerPrice);
        int[] carLoadCapacity = integerParsable.parsStringToInteger(arrayOfIntegerCarLoadCapacity);
        int[] numberOfPassangers = integerParsable.parsStringToInteger(arrayOfIntererNumberOfPassangers);

        ArraysOfColors arraysOfColors = new ArraysOfColors();
        arraysOfColors.addColorsForArray();
        creatorTaxis.creatorPlaceOfTaxi(splitLine.split(unsplitedStringForModel), arraysOfColors.addColorsForArray(), priceOfCars, carLoadCapacity, numberOfPassangers);


    }


}
