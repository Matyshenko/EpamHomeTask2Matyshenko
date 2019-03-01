package util.txtfilevalidator;

import util.inputfiles.CreateFiles;

public class RunnerTxtValidator {
    public void startTxtValidator() {
        TxtValidatable validateTxt = new TxtFileValidator();

        CreateFiles createFiles = new CreateFiles();
        validateTxt.validateFile(createFiles.loadModelForTaxi());
        validateTxt.validateFile(createFiles.loadPriceForTaxi());
        validateTxt.validateFile(createFiles.loadCarLoadCapacity());
        validateTxt.validateFile(createFiles.numberOfPassanger());

    }
}
