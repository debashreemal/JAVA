public class studentMarks {
    public static void main(String[] args){

        int English = 80;
        int Science = 85;
        int SST = 90;
        int Maths = 100;
        double Hindi = 89.99;
    
        double total = English + Science + SST + Maths + Hindi;
        double avg = total/5.0;
    
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }

}
