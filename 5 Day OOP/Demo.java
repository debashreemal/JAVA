
public class Demo {
    public static void main(String[] args) {
        int r = 0;
        Demo2 obj = new Demo2();
        r = obj.c;

        int r2 = 0;
        Demo1 obj2 = new Demo1();
        // r2 = obj2.a;

        System.out.println(r);
        System.out.println(r2);
    }
}

class Demo1{
    private int a = 11;      //Accesed within the class
    int b = 22;

    void display(){
        System.out.println("Inside Display");
    }

    void fun(){
        System.out.println("Inside Function");
    }   
}

class Demo2{
    int c = 33;
    int d = 44;

    void display2(){
        System.out.println("Inside Display 2 ");
    }

    void fun2(){
        System.out.println("Inside Function 2 ");
    }   
}
