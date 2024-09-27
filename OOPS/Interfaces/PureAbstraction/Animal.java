package OOPS.Interfaces.PureAbstraction;

// Interfaces are blueprint of classes.

// Classes will "implement" this interface i.e provide the implementation of the abstract methods OR make that class abstract.

// Interfaces only have: abstract methods & static contants.

public interface Animal {

    // anything before data type is redundant bcz they are static.

    int max_age = 12; // all the constants are static i.e can access via interface and class.

    // we can also create static methods in Interfaces, but they can only be
    // accessed via the interface
    public static void info() {
        System.out.println("This is Animal interface");
    }

    public abstract void eat(); // still no need to write public and abstract

    void sleep();

    // usecase of default keyword:

    // if you'd have created a static method: only access via Interface

    // if created a abstract method: provide its' implementation in the classes

    // extending it.

    // using default to create field/method: object of class extending the interface
    // can access it.
    public default void run() {
        System.out.println("Animal is running");
    }
}
