
public class ProductOverloading {
    public static void main(String[] args) {
        product dis = new product("KiTKaT", 100);
        dis.display();
    }
}

class product{
    String name;
    int price;

    product(){
        name = "Flower";
        price = 0;
    }

    product(String name){
        this.name = name;        
    }

    product(String name, int price){
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}