
public class StudentMarks {
    public static void main(String[] args) {
        int [] marks = {85, 90, 78, 92, 88};
        StudentResult result = new StudentResult("Deb", 101, marks);
        result.display();
    }   
}

class StudentResult{
    String name;
    int rollno;
    int [] marks;

    StudentResult(String name, int rollno, int [] marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;        
    }

    int totalMarks(){
        int t = 0;

        for(int  i = 0; i < marks.length; i++){
            t += marks[i];
        }

        return t;
    }

    int avgMarks(){
        int a = totalMarks() / marks.length;
        return a;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Total Marks: " + totalMarks());
        System.out.println("Average Marks: " + avgMarks());
    }
}