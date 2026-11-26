// Reverse a String using loop and character access

public class reverseString {
    public static void main(String[] args){
        String name = "Debashree Mal";

        System.out.print("Reverse string: " ) ;
        for( int i = name.length() - 1 ; i >= 0; i--){
            System.out.print(name.charAt(i) + " ");
        }
    }
}
