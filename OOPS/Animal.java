package OOPS;

public class Animal extends PrimalAnimal {
    Boolean canEat, canSleep;

    public Animal() {
        System.out.println("Animal constructor called!");
        this.canEat = true;
        this.canSleep = true;
    }

    public void makeSound() {
        System.out.println("some sound");
    }
}
