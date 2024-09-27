package OOPS;

public class Test {
    public static void main(String[] args) {
        // Cat cat = new Cat();
        // Dog dog = new Dog();
        // Animal animal = new Animal();
        // dog.makeSound();
        // cat.makeSound();
        // animal.makeSound();

        // Animal dog = new Dog();
        // dog.makeSound();

        System.out.println(sum(2, 3));
        System.out.println(Sum(2, 4));
        System.out.println(sum(1, 2, 4, 5, 6, 78, 787, 87));

        String s = "babin";
        System.out.println(uppercase(s));

        System.out.println(s);

    }

    private static String uppercase(String str) {
        return str.toUpperCase();
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static float Sum(int a, int b) {
        return a + b;
    }

    private static int sum(int... a) { // treated as array
        int totsum = 0;
        for (int i : a) {
            totsum += i;
        }

        return totsum;
    }
}
