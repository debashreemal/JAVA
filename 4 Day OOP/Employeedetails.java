
public class Employeedetails {
    public static void main(String[] args) {
        
        employee r1 = new employee("D001", "Debashree", 100000);
        employee r2 = new employee("D002", "Piyuuu", 200000);

        r1.display();
        r2.display();
    }
}

class employee{
    String eid;
    String name;
    int salary;

    employee( String eid, String name, int salary){
        this.eid = eid;
        this.name = name ;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee Id: " + eid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
