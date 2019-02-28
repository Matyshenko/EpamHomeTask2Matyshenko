package car.spetification;

public enum Color {
    RED("Red"),
    BLACK("Black"),
    GREEN("Green"),
    WHTIE("White"),
    YELLOW("Yellow");

    private String name;

    Color(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " " + name ;
    }

    public String getName() {
        return name;
    }
}
