package indra.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Indra";
        first = first + " " + "Wijaya";

        System.out.println(first);

        String second = "Indra Wijaya";
        System.out.println(second);

        System.out.println(first==second);  //error
        System.out.println(first.equals(second));

    }
}
