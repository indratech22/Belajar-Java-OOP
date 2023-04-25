package indra.data;

public class Avanza implements Car,IsMaintenance{

    public void drive() {
        System.out.println("avanza drive");
    }

    public int getTier() {
        return 4;
    }


    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
