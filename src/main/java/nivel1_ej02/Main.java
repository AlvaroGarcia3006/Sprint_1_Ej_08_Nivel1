package nivel1_ej02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Juan", "María", "Luis", "Oro", "Álvaro", "Benito", "Abelardo");
        List<String> outputList = list.stream().filter(l -> l.contains("o") && l.length() >= 5).collect(Collectors.toList());

        System.out.println(list.toString());
        System.out.println(outputList.toString());
    }
}
