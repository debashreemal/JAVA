
public class VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle obj;
        obj = new Bike("kk" , 2000);
        obj.display();
        obj = new Car("Mm" , 4000);      
        obj.display();
    }
}

class Vehicle{
    String brand;
    int speed;

    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    void display(){
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Speed: " + speed);
    }
}

class Bike extends Vehicle{

    Bike(String brand, int speed){
        super(brand, speed);
    }

    void display(){
        System.out.println("Bike Brand: " + brand);
        System.out.println("Bike Speed: " + speed);
    }
}

class Car extends Vehicle{

    Car(String brand, int speed){
        super(brand, speed);
    }

    @Override
    void display(){
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Speed: " + speed);
    }
}
