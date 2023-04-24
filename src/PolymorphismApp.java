public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("indra");
        employee.sayHello("budi");

        employee = new Manajer("alex");
        employee.sayHello("thomas");

        employee = new VicePresident("nando");
        employee.sayHello("ayuen");

        sayHello(new Employee("Indra"));
        sayHello(new Manajer("Alex"));
        sayHello(new VicePresident("Nando"));
    }


    static void sayHello (Employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        }else if(employee instanceof Manajer) {
            Manajer manajer = (Manajer) employee;
            System.out.println("Hello VP " + manajer.name);
        }else {
            System.out.println("Hello " + employee.name);
        }
    }
}
