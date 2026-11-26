//Write a program to print even and odd number from 1 to 1000

public class evenodd {
    public static void main(String[] args){
       
        for ( int i = 1; i <= 1000; i++){
            if ( i % 2 == 0 ){
                System.out.println("Even = "  + i);
            }
            else{
                System.out.println("Odd = " + i);
            }
        }

    }
}
