public class SimpleBill {
    public static void main(String[] args){
        int itemprice = 99;
        int quantity = 100;
        int subtotal = itemprice * quantity;
        double tax = subtotal * 18/100;
        double bill = subtotal + tax;
        System.out.println("subtotal: "+ subtotal);
        System.out.println("Tax amount: " +  tax);
        System.out.println("final Bill: " + bill);
    }
}
