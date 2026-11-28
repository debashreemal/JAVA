
public class Polymorphism {
    public static void main(String[] args) {
        // declared refernece as Animal and created instance of dog and cat

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}

class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meows");
    }
}


