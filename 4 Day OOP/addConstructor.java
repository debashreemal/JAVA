
public class addConstructor {
   public static void main(String[] args){
    
    arithemtic he = new arithemtic();
    arithemtic obj = new arithemtic(10, 20); //object
    int sum = obj.add(10, 20);
    System.out.println("Addition = " + sum);

    System.out.println(obj.m);
   }
}

// user defined class - data type
class arithemtic{
    int m = 110;

    //Constructor
    arithemtic(){
        System.out.println("Default Constructor called");
    }

    arithemtic(int x, int y){
        System.out.println("Parameterized Constructor called");
    }

    //function or method
    int add( int a, int b){
        return a+b;
    }
}


//static - without creating object function call
// static int add( int a, int b){
//     return a+b;
//    } 
