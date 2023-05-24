package indra.application;

import indra.Annotation.Fancy;
import indra.data.*;

@Fancy(name = "AnimalApp", tags= {"Application","Java"})
public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }


}
