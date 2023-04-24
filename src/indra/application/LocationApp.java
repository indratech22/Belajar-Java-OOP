package indra.application;

import indra.data.City;
import indra.data.Location;

public class LocationApp {
    public static void main(String[] args) {

        //var location = new Location(); // ERROR

        var city = new City();
        city.name = "Lampung";

        System.out.println( city.name);

    }
}
