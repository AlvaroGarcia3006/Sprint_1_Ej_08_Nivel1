package nivel1_ej05;

public class Main {
    public static void main(String[] args) {
        FuncInterface fi = () -> {return 3.1415;};
        System.out.println(fi.getPiValue());
    }
}

