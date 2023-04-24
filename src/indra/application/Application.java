package indra.application;

import indra.data.*;


public class Application {
    public static void main(String[] args) {

        String name = "Indra";

        Product product = new Product("mac book pro", 3000000);

        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();

    }
}
