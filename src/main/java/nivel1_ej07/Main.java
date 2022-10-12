package nivel1_ej07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Abelardo","Febrero","Mayo","288","1","262661","Julio");
        List<String> sortedList = list.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(sortedList);
    }
}
