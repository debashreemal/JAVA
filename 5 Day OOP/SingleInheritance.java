class SingleInheritance {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.fun();
        int r = obj.a; // 
        // int r1 = obj.b;  Error as it is private 

        System.out.println("Protected a : " + r);
        obj.display();
    }
}

class Base{
    protected int a = 11;
    private int b = 22;

    void display(){
        System.out.println("Inside Display");
        System.out.println(b);
    }

    void fun(){
        System.out.println("Inside Function");
    }  

}

//Inherited from Base 
class Derived extends Base{
    int c = 33;
    int d = 44;

    void display2(){
        System.out.println("Inside Display 2 ");
    }

    void fun2(){
        System.out.println("Inside Function 2 ");
    }   
}
