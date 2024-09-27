package OOPS.Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Dog();

        d.sayHello();
        a.sayHello();
        System.out.println(a.name);
    }
}
