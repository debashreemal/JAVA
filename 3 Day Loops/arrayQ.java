public class arrayQ {
    public static void main(String[] args){
        int [] a = {15,19,29,10,28};

        //sum
        int sum = 0;
        for( int i=0; i< a.length; i++ ){
            sum += a[i];
        }
        System.out.println("Sum = " + sum);
   
        //average
        int avg = sum / a.length ;
        System.out.println("Average = " + avg);

        //minimum
        int min = a[0];  
        for( int j=0; j<a.length; j++){
            if(min>a[j]){
                min = a[j];
                System.out.println("minimum = " + min);
            }
        }

         //maximum
        int max = a[0];  
        for( int j=0; j<a.length; j++){
            if(max < a[j]){
                max = a[j];
                System.out.println("maximum = " + max);
            }
        }
    }
}
