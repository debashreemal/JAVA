
public class thiskeyword {
    public static void main(String[] args) {
        demo obj = new demo(30, 40);
        obj.display();
    }
}                                                                          

class demo{
    int a = 10;
    int b = 20;

    demo(int a, int b){
        this.a = a;
        this.b = b;
        // a = a;
        // b = b;
    }
 
    void display(){
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
        
}
