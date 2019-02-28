package util.inputfiles;

import java.io.File;

public class CreateFiles implements FileCreatable {

    @Override
    public File loadModelForTaxi() {
        return new File("src/main/resources/datafiles/modelForTaxi.txt");
    }

    @Override
    public File loadPriceForTaxi() {
        return new File("src/main/resources/datafiles/priceForTaxi.txt");
    }

    @Override
    public File loadCarLoadCapacity() {
        return new File("src/main/resources/datafiles/carLoadCapacity.txt");
    }

    @Override
    public File numberOfPassanger() {
        return new File("src/main/resources/datafiles/numberOfPassangers.txt");
    }
}
