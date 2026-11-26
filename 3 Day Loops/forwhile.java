/* 

for( initialize; condition; inc/dec){
}


initialize;
while(condition){
    increment/decrement;
}


initialize:
do{
increment/decrement;
}while (condition);
*/

//Write a program to print number 1 to 10 

public class forwhile {
    public static void main(String[] args){

        // int i ;
        for(int i = 1; i <= 10; i++){
            System.out.println("For loop: " + i);
        }


        int i = 1;
        while( i <= 10 ){
            System.out.println("While loop: " + i );
            i++;
        }


        int j = 1;
        do{
            System.out.println("Do while: " + j);
            j++;
        } while (j <= 10);
    }
}
