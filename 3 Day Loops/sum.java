public class sum {
    public static void main(String[] args) {
        int sum = 0;
        int N = 2;

        for(int i=1; i<=N; i++ ){
            sum += i;
        }

        System.out.println("Sum of " + N + " numbers = " + sum);
    }
}
