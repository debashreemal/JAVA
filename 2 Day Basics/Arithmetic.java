public class Arithmetic {

    // Created function arithmetic
    static void arithmetic(double a , double b){
        System.out.println("Sum = " + (a+b));
        System.out.println("Difference = " + (a-b));
        System.out.println("Product = " + (a*b));   
        System.out.println("Quotient = " + (a/b));
        System.out.println("Remainder = " + (a%b));
    }

    //created main function to call arithmetic function
    public static void main(String[] args){
        arithmetic(90, 10);
        arithmetic(909, 10);
    }
}
