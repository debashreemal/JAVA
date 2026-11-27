public class Rectangleoverload {
    public static void main(String[] args){
        
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle(3);
        System.out.println("Area of rectangle1: " + r1.area());
        System.out.println("Area of rectangle2: " + r2.area());

        rectangle r3 = new rectangle(2, 8);
        System.out.println("Area of rectangle3: " + r3.area());
        System.out.println("Perimeter of rectangle3: " + r3.perimeter());

    }
}

class rectangle{
    int l;
    int b;

    rectangle(){
        // l = 1;
        // b = 1;

        this(1, 1);
    }

    rectangle(int s){
        // this.l = s;
        // this.b = s;

        this(s, s);
    }

    rectangle(int l, int b){
        this.l = l;
        this.b = b;
    }

    int area(){
        return l*b;
    }
    
    int perimeter(){
        return 2*(l + b);
    }
}
