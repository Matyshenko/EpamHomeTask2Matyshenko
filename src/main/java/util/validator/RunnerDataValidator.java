package util.validator;

import util.inputfiles.CreateFiles;
import util.inputfiles.FileCreatable;
import util.reader.DataFileReadable;
import util.reader.DataReader;
import util.reader.WrongFileExaprion;

public class RunnerDataValidator { //Переименовать, это не валидатор
    public static String unsplitedStringForModel = "";// not static
    public static String unsplitedStringForPrice = "";
    public static String unsplitedStringForCarLoadCapacity = "";
    public static String unsplitedStringForNumberOfPassangers = "";

    public void startValidation(){ // переписать в один метод
        DataFileReadable dataFileReadable = new DataReader(); //Переименовать интерфейс
        FileCreatable createFiles = new CreateFiles();

        DataValidatorable dataValidatorForString = new StringDataValidator();
        DataValidatorable dataValidatorForInteger = new IntegerDataValidator();

        try {
            unsplitedStringForModel = dataFileReadable.fileRaderString(createFiles.loadModelForTaxi(), dataValidatorForString);
        } catch (WrongFileExaprion wrongFileExaprion) {
            wrongFileExaprion.printStackTrace();
        }

        try {
            unsplitedStringForPrice = dataFileReadable.fileRaderString(createFiles.loadPriceForTaxi(), dataValidatorForInteger);
        } catch (WrongFileExaprion wrongFileExaprion) {
            wrongFileExaprion.printStackTrace();
        }

        try {
            unsplitedStringForCarLoadCapacity = dataFileReadable.fileRaderString(createFiles.loadCarLoadCapacity(), dataValidatorForInteger);
        } catch (WrongFileExaprion wrongFileExaprion) {
            wrongFileExaprion.printStackTrace();
        }

        try {
            unsplitedStringForNumberOfPassangers = dataFileReadable.fileRaderString(createFiles.numberOfPassanger(), dataValidatorForInteger);
        } catch (WrongFileExaprion wrongFileExaprion) {
            wrongFileExaprion.printStackTrace();
        }
    }
}
