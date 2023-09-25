package homework50;

import java.nio.charset.StandardCharsets;
import java.util.Deque;
import java.util.LinkedList;

public class RobotAppl {
    /*
    Задача 2
    Представьте, у вас есть робот, который понимает команды:
    'С' - шаг на север
    'Ю' - шаг на юг
    'З' - шаг на запад
    'В' - шаг на восток
    Команды роботу поступают в виде строки вида "CЗВЗЗТЮ". Очевидно, если в строке присутствуют рядом взаимно
    противоположные команды например "ЗВ" или "СЮ" их можно сократить. Очевидно, что после сокращения, в строке опять
    взаимно противоположные команды могут оказаться рядом, и их опять можно сократить.
    Напишите метод, который оптимизирует строку команд для робота, сокращая лишние шаги.
    Примеры: "СЮСЗ" -> "СЗ"
    "СЮВЗ" -> ""
    "СВЮЗ" -> "СВЮЗ"
    "СВЗЮВЮЗССЮ" -> "ВЮЗС"
    */
    public static void main(String[] args) {

        String commandLine = "NEWSESWNNS";
        String commandLine1 = "NSWE";
        String commandLine2 = "NESW";

        System.out.println(finalCommandLine(commandLine));
        System.out.println(finalCommandLine(commandLine1));
        System.out.println(finalCommandLine(commandLine2));
    }

    public static String finalCommandLine(String str) {
        Deque<Character> newLine = new LinkedList<>();
        for (Character ch : str.toCharArray()) {
            if (!(ch.equals('N') || ch.equals('S') || ch.equals('E') || ch.equals('W'))) {
                throw new IllegalArgumentException();
            }
            Robot.valueOf(ch.toString()).controlStack(newLine);
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : newLine) {
            sb.append(ch);
        }
        return sb.reverse().toString();
    }

   /* public static String commandBuilder(String str) {
        for (Character ch : str.toCharArray()) {
        }
    }*/

}
