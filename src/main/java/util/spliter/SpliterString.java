package util.spliter;

public class SpliterString implements SplitLine{

    public String[] split(String unsplitedString) {
        String[] splitedString = unsplitedString.split(" ");
        return splitedString;
    }

}
