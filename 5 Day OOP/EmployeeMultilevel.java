
public class EmployeeMultilevel {
    public static void main(String[] args) {
        Person obj;
        obj = new Employee("Computer", "Deb");
        obj.display();
    }
}

class Person{
    String branch;

    Person(String branch){
        this.branch = branch;
    }

    void display(){
        System.out.println(" Branch: " + branch);
    }
}

class Employee extends Person{
    String ename;

    Employee(String branch, String ename){
        super(branch);
        this.ename = ename;
    }

    void display(){
        System.out.println("Employee name: " + ename);
    }
}

class Manager extends Employee{
    String mname;

    Manager(String branch, String mname){
        super(branch);
        this.mname = mname;
    } 

    void display(){
        System.out.println("Manager name: " + mname);
    }
}
