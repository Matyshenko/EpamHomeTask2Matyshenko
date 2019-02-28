package util.parser;

public class ParsedInteger implements IntegerParsable {
    @Override
    public int[] parsStringToInteger(String[] splitedString) {
        int[] integerData = new int[splitedString.length];
        for (int i = 0; i < splitedString.length; i++) {
            integerData[i] = Integer.parseInt(splitedString[i]);
        }
        return integerData;
    }
}
