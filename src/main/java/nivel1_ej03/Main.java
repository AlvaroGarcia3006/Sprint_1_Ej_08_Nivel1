package nivel1_ej03;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
                "Agosto","Septiembre","Octubre","Noviembre","Diciembre");
        list.forEach(Main::printMonths);
    }
    public static void printMonths(String month) {
        System.out.println(month);
    }
}
