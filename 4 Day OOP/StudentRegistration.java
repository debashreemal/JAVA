
public class StudentRegistration {
    public static void main(String[] args) {
        int [] marks = {85, 90, 78, 92, 88};
        StudentResult result = new StudentResult("Deb", 101, "Computer Engineering", marks);
        result.display();
    }   
}

class StudentResult {
    String name;
    int rollno;
    String branch;
    int [] marks;

    StudentResult(String name, int rollno, String branch, int [] marks) {
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
        this.marks = marks;        
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Branch: " + branch);
        System.out.print("Marks: ");
         for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}