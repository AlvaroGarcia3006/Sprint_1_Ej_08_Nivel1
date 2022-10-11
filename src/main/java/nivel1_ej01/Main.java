package nivel1_ej01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Juan", "María", "Luis", "Álvaro", "Benito", "Abelardo");
        ArrayList<String> outputList = new ArrayList<String>();
        list.forEach(l->{
            if(l.contains("o")) outputList.add(l);
        });
        System.out.println(list.toString());
        System.out.println(outputList.toString());
    }
}
