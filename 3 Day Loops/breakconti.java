public class breakconti {
    public static void main(String[] args){

        System.out.println("continue:");
        for(int i = 0; i <= 5; i++){
            if(i == 3){
                continue; //3 skipped
            }
            System.out.println(i);
        }
        
        System.out.println("break:");
        for(int j = 0; j <= 5; j++){
            if(j==3){
                break; //3 skipped and loop terminated
            }
            System.out.println(j);
        }
    }
}
