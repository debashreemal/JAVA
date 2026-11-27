
public class bankaccount {
    public static void main(String[] args) {
       bankaccountdetail show = new bankaccountdetail(123456789, "Debashree", 9999999);
       show.display();
       show.deposit(1000);
       show.withdraw(100);
       show.display();
    }
}

class bankaccountdetail{
    int Accountno ;
    String Holdername;
    int Balance;
    
    //parameterized Constructor
    bankaccountdetail(int Accountno, String Holdername, int Balance){
        this.Accountno = Accountno;
        this.Holdername = Holdername;
        this.Balance = Balance;
    }

    //methods 
    void deposit(int m){
        Balance += m;
    }

    void withdraw(int m){
        if ( m > Balance ){
            System.out.println("Insuffient Bank Balance");
        }
        else{
            Balance = Balance - m;
        }
    }

    void display(){
        System.out.println("Bank Account no. : " + Accountno);
        System.out.println("Bank Holder name : " + Holdername);
        System.out.println("Bank Balance : " + Balance);
    }

}

