/*
print
***
***
***

*/
public class star {
    public static void main(String[] args){

        for( int r= 1; r <=3; r++){     //rows space
            for( int c= 1; c <=3; c++){  //columns
                System.out.print("*");   // 3 stars in each row
            }
            System.out.println("");     //new line for each row
        }
    }
}
