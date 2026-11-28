
public class PaymentPoly {
    public static void main(String[] args) {

        //Same object name two methods call
        Payment payy;

        payy = new CardPayment();
        payy.pay(999);

        payy = new UPIPayment();
        payy.pay(000);

    }
}

class Payment{

    void pay(double money){
        System.out.println("Payment: " + money);
    }
}

class CardPayment extends Payment{

    void pay(double money){
        System.out.println("Payment Card: " + money);
    }
}

class UPIPayment extends Payment{

@Override
    void pay(double money){
        System.out.println("Payment UPI: " + money);
    }
}




