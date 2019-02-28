package util.spliter;

public class SpliterString implements SplitLine {

    public String[] split(String unsplitedString) {
        return unsplitedString.split(" ");
    }

}
