package nivel1_ej08;

public class Main {
    public static void main(String[] args) {
        FunInterface fi = s -> {
            StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.reverse();
            return sb.toString();
        };
        System.out.println(fi.reverse("Este es el final del Sprint 1."));
    }
}
