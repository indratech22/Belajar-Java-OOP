package indra.data;

public class Product {

    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "product name:" + name + "price:" +price;
    }
}
