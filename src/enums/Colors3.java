package enums;

public enum Colors3 {
    GREEN(10, "green"),
    BLUE(20, "blue"),
    RED(30, "red"),
    BLACK(0, "black");

    private int intValue;
    private String stringValue;

    Colors3(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return "enums.Colors3{" + "intValue=" + intValue + ", stringValue='" + stringValue + '\'' + '}';
    }
}
