public class Percentage {
    public static void main(String[] args){
        int s1 = 90;
        int s2 = 80;
        int s3 = 90;
        int s4 = 95;
        int s5 = 99;
        double s6 = 98.99;
        double totalmarks = s1+s2+s3+s4+s5+s6;

        System.out.println("Percentage = " + ((totalmarks/600) * 100));
    }
}