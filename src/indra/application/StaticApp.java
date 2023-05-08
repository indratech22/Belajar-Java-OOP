package indra.application;


import indra.data.Applocation;
import static indra.data.Constant.*;
import indra.data.Country;
import util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Lampung");
        System.out.println(city.getName());

        System.out.println(Applocation.PROCESSORS);
    }


}
