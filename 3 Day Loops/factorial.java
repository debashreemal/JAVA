public class factorial {
    public static void main(String[] args) {
        int fact = 1;
        int N = 2;
        for(int i=1; i<=N; i++ ){
            fact *= i;
        }
        System.out.println("Factorial " + N + "! = " + fact );
    }
}
