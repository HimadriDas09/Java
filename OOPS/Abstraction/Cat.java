package OOPS.Abstraction;

public class Cat extends Animal {

    public Cat() {
        // overriding protected field via children
        super.name = "bani";
    }

    public void sayHello() {
        System.out.println("meow");
    }
}
