package OOPS;

public class Dog extends Animal {
    String breed, name;

    public Dog() {
        System.out.println("dog constructor called!");
    }

    // public Dog(String breed, String name) {
    // // i want to initialize the parent fields
    // super();
    // System.out.println("Dog constructor called!");
    // this.breed = breed;
    // this.name = name;
    // }

    public void makeSound() {
        System.out.println("Woof");
    }
}
