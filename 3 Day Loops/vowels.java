public class vowels {
    public static void main(String[] args) {
        String alpha = "DEBASHREE";

        for(int i=0; i<alpha.length(); i++ ){

            char c = alpha.charAt(i);

            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                System.out.println("Vowels : " + alpha.charAt(i));
            }
        }
    }
}
