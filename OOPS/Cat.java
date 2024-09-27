package OOPS;

public class Cat extends Animal {
    // cat can also eat,sleep: so it's a child class of animal
    String breed, name;

    public void makeSound() {
        System.out.println("Meow");
    }
}
