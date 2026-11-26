public class array2d {
    public static void main(String[] args){
        int [][] a = {{10,20,30}, {50,60,70}};
        
        System.out.println(a[1][1]);
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[1].length);

        for( int r = 0; r < a.length; r++ ){
            for( int c = 0; c < a[r].length; c++ ){
                System.out.print(a[r][c] + " ");
            }
            System.out.println("");
        } 

    }
}
