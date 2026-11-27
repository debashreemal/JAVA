
public class person {
    public static void main(String[] args) {
        persondetail r = new persondetail("Hehe", 99);
        r.display();
    }
}

class persondetail{
    String name = "Debss";
    int age = 20;

    persondetail(String name, int age){
        this.name = name ;
        this.age = age;

        // name = name;
        // age = age;
    
    }


    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}