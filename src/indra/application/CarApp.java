package indra.application;

import indra.data.Avanza;
import indra.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
