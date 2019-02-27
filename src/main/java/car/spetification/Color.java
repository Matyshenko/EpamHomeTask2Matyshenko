package car.spetification;

public enum Color {
    RED("Red"),
    BLACK("Black"),
    GREEN("Green"),
    WHTIE("White"),
    YELLOW("Yellow"),
    BLUE("Blue");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
