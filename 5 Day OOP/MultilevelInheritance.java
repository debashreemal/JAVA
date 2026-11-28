
public class MultilevelInheritance {
    public static void main(String[] args) {
        level3 obj = new level3();

        obj.display2();

        int r = obj.a;
        System.out.println(r);
    }
}

class level1{
    int a = 1;
    
    void display1(){
        System.out.println("Display 1");
    }
}

class level2 extends level1{
    int b = 1;
    
    void display2(){
        System.out.println("Display 2");
    }
}

class level3 extends level2{
    int c = 1;
    
    void display3(){
        System.out.println("Display 3");
    }
}