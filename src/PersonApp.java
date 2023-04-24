public class PersonApp {

    public static void main(String[] args) {

        var person1 = new Person("Indra WIjaya","Bandar Lampung");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
       person1.sayHello("budi");

        Person person2 = new Person("Budi Nugroho");

        Person person3;
        person3 = new Person();
        person3.name = "joko";
        person3.address = "bandung";



    }

}
