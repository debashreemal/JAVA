public class SearchElement {
    public static void main(String[] args) {
        int [] a = {11,22,33,44,55,44};
        int search = 44;

        for(int i=0; i < a.length; i++ ){
            if(a[i] == search){
                System.out.println("Element found at index = " + i);
                // break;
            }
        }
    }
}
