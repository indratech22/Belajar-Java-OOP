public class VicePresident extends Manajer{

    VicePresident (String name){
        super(name);
    }

    void sayHello(String name){
        System.out.println("Hi "+ name + " ,My Name Is VP " + this.name);
    }
}
