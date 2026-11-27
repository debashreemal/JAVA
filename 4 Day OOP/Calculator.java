
public class Calculator {
    public static void main(String[] args) {     
        Calculatormethod r = new Calculatormethod();
        System.out.println("Addition: " + r.add(2,3));
    }
}

class Calculatormethod{

    double add( double a, double b){
        return a+b;
    }
    double sub( double a, double b){
        return a-b;
    }
    double mul( double a, double b){
        return a*b;
    }
    double div( double a, double b){
        if( b == 0){
            System.out.println("Not Divisible");
            return 0;
        }
        else{
            return a/b;
        }
    }
}
