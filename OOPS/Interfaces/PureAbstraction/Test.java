package OOPS.Interfaces.PureAbstraction;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        System.out.println(Dog.max_age);
        System.out.println(Animal.max_age);

        Animal.info();
        // Dog.info();

        // Animal.run();
        d.run();
    }
}
