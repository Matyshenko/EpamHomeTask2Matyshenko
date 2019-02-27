import car.cartypes.Car;
import car.spetification.Color;
import util.reader.DataReadFile;
import util.reader.DataReader;
import util.reader.WrongFileExaprion;
import util.spliter.SplitLine;
import util.spliter.SpliterString;
import util.txtfilevalidator.TxtFileValidator;
import util.txtfilevalidator.ValidateTxt;
import util.validator.DataValidator;
import util.validator.FileDataValidator;

import java.io.File;

public class Main {
    public static void main(String[] args) throws WrongFileExaprion {
        File file = new File("src/InputFile.txt");
        ValidateTxt validateTxt = new TxtFileValidator();
        validateTxt.validateFile(file);

        DataReadFile dataReadFile = new DataReader();
        DataValidator dataValidator = new FileDataValidator();

        String unsplitedString = "";
        try {
            unsplitedString = dataReadFile.fileRaderString(file, dataValidator);
        } catch (WrongFileExaprion e) {
            throw new WrongFileExaprion("File wrong", e);
        }

        SplitLine splitLine = new SpliterString();
        splitLine.split(unsplitedString);
        System.out.println("Массив строк: " + unsplitedString);
        Car car = new Car(Color.BLACK, 124, 3000, 5, 7);
        car.setColor(Color.WHTIE);


    }
}
