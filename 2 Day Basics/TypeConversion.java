class TypeConversion {
    public static void main(String[] args) {
        int age = 20;
        age += 10;
        age ++;
        System.out.println("Age is: " + age );

        // Type casting

        //narrowing conversion
        double number = 18.999; 
        int number1 = (int)number; 
        System.out.println("Narrowing: " + number1);

        //widening conversion
        int number2 = 19; 
        double number3 = (double)number2;
        System.out.println("Widening: " + number3);

        double num = 9999.5;
        byte num1 = (byte)num; 
        System.out.println("Num is: " + num1);  
        //double 9999.5 -> int 9999( 16 bits) -> byte ( 8 bit)  0000 1111 => 15
    }
}
