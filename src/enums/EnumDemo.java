package enums;

public class EnumDemo {

    public static void main(String[] args) {
        Car car1 = new Car("Opel", "BBB6754", Colors.BLACK);

        printAllColors();
        System.out.println("-------------------------------");
        System.out.println(getColor("RED"));

        System.out.println("-------------- COLORS 2 -----------------");
        Colors2 c2 = Colors2.GREEN;
        c2.printText();

        System.out.println("------------ COLORS 3 -------------------");
        Colors3 c3 = Colors3.BLACK;
        System.out.println(c3);


    }
    public static Colors getColor(String colorsString) {
//        if (colorsString.equals("red")) return enums.Colors.RED;
        return Colors.valueOf(colorsString);
    }
    public static void printAllColors() {
        for (Colors color : Colors.values()) {
            System.out.println(color);
        };
    }
}
