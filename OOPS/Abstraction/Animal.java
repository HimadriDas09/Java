package OOPS.Abstraction;

public abstract class Animal {
    protected String name;

    // constructor : protected bcz it's only to be accessed via child constructor,
    // so no point of keeping it public
    protected Animal() {
        this.name = "ani";
    }

    // abstract method(i.e fn with no definition) should be in abstract class
    protected abstract void sayHello();

    public void sleep() {
        System.out.println("zzz...");
    }
}
