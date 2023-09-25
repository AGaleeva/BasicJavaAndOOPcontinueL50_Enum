package consultation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListNamesLength {
    /*
    Есть список с именами:Ivan, Maria, Stephan, John, Amaliya.
    Написать функцию, которая вернет список, содержащий имена из исходного списка длиной больше 4-х.
    */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of( "Ivan", "Maria", "Kim", "Stephan", "John", "Amalia"));
        System.out.println(getNamesMoreThanFourLetters2(names));
//        System.out.println(getNamesMoreThanFourLetters(names));
    }

    public static List<String> getNamesMoreThanFourLetters(List<String> list) {
        List<String> shortenList = new ArrayList<>();
        for (String name : list) {
            if (name.length() != 4) {
                shortenList.add(name);
            }
        }
        return shortenList;
    }

    public static List<String> getNamesMoreThanFourLetters1(List<String> list) {

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().length() == 4) {
                iterator.remove();
            }
        }
        return list;
    }

    public static List<String> getNamesMoreThanFourLetters2(List<String> list) {
        ArrayList<String> res = new ArrayList<>(list);
        res.removeIf(s -> s.length() == 4);
        return res;
    }
}
