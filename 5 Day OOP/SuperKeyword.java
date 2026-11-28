
public class SuperKeyword {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.display();
        Derived obj1 = new Derived(50, 80);
    }
}

// If both methods in parent and child class has same name and we have to call parent method in child class we use superkeyword.
class Base{

    Base(){
        System.out.println("Inside Base Default Constructor");
    }
    
    Base(int a, int b){
        System.out.println("Inside Base Parameterised Constructor");
    }

    void display(){
        System.out.println("Inside Base Display");
    }

}

class Derived extends Base{

    Derived(){
        System.out.println("Inside Derived Default Constructor");
    }
    
    Derived(int x, int y){
       super(10, 20);
       System.out.println("Inside Derived Parameterised Constructor");
    }

    void display(){
        super.display();
        System.out.println("Inside Derived Display");
    }

}