package util.spliter;

public class SpliterString implements LineSplitable {

    public String[] split(String unsplitedString) {
        return unsplitedString.split(" ");
    }

}
