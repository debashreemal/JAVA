public class HierarchicalInheritance {
    public static void main(String[] args) {
        child3 obj = new child3();
        obj.display();
    }
}

class Parent{
    void display(){
        System.out.println("I am Parent");
    }
}

class child1 extends Parent{
    void display1(){
        System.out.println("I am Child 1");
    }
}

class child2 extends Parent{
    void display2(){
        System.out.println("I am Child 2");
    }
}

class child3 extends Parent{
    void display3(){
        System.out.println("I am Child 3");
    }
}