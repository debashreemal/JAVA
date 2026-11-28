
public class StudentInheritance {
    public static void main(String[] args) {
       
        Student obj = new Student("Debashree", 20, 26, "Computer");
        obj.display();
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person{
    int rollno;
    String branch;

    Student(String name, int age, int rollno, String branch){
        super(name, age);
        this.rollno = rollno;
        this.branch = branch;
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Rollno: " + rollno);
        System.out.println("Branch: " + branch);
    }
}