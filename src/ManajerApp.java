public class ManajerApp {
    public static void main(String[] args) {

        var manajer = new Manajer("Indra");
        manajer.sayHello("Budi");

        var vp = new VicePresident("Alex");
        vp.sayHello("thomas");

        System.out.println(manajer);
        System.out.println(vp);
    }
}
