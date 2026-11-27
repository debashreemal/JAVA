
public class Book {
    public static void main(String[] args) {
        bookdetail show = new bookdetail("Plutocampus","Piyu Debss",100000);
        show.display();
    }
}

class bookdetail{

    String Title;
    String Author;
    int Price;

    bookdetail(String Title, String Author, int Price){
        this.Title = Title;
        this.Author = Author;
        this.Price = Price;
    }

    void display(){
        System.out.println("Book Title: " + Title);
        System.out.println("Book Author: " + Author);
        System.out.println("Book Price: " + Price);
    }
}
