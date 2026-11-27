
public class StudentClass {
    public static void main(String[] args) {
        student obj = new student("Debashree" , 26 , "Computer");
        obj.display();
    }
}

class student{

    String name;
    int rollno;
    String branch;

    student(String name, int rollno, String branch){
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
    }

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Rollno: "+ rollno);
        System.out.println("Branch: "+ branch);
    }
}
