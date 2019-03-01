package util.inputfiles;

public class RunnerCreatorFiles {

    public void startCreatorFiles(){
        FileCreatable createFiles = new CreateFiles();
        createFiles.loadCarLoadCapacity();
        createFiles.numberOfPassanger();
        createFiles.loadModelForTaxi();
        createFiles.loadPriceForTaxi();

    }



}
