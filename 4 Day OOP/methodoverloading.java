//

public class methodoverloading {
    public static void main(String[] args) {

        overload obj = new overload();
        int sum = obj.add(99, 99);
        System.out.println("Sum = " + sum);       
    }
}

class overload{

    // same name different parameter

    int add( int a , int b){
        return a+b;
    }

    int add( int a, int b, int c){
        return a+b+c;
    }

    double add( int a, int b, int c, int d ){
        return a+b+c+d;
    }

    double add( float a, float b, float c ){
        return a+b+c;
    }   
}


