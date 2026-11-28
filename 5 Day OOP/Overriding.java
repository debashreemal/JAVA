
public class Overriding {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.display();
    }
}

class Base{
    void display(){
        System.out.println("I am Base");
    }
}

class Derived extends Base{
@Override  //to print derived display method , overrided because both method has same name display
    void display(){
        System.out.println("I am Derived");
    }
}
