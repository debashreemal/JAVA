public class Logical {
    public static void main(String[] args){
        boolean hasRegister = false;
        boolean haspaidfees = false;
        boolean exam = hasRegister && haspaidfees ;
        System.out.println("Student can attend Exam? "+ exam);   
        
        if ( exam == true ){
            System.out.println("Student can attend Exam");
        }
        else{
            System.out.println("Student cannot attend Exam");
        }
    }
}
