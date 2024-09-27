package OOPS.Interfaces.MultipleInheritance;

public interface Phone {

    // abstract method
    public abstract void makeCall(String number);

    // create static constants: interface + class can access.
    static String sim = "JIO";

    // create static methods : only Interface can access
    public static void showPrice() {
        System.out.println("14000");
    }

    // creating a default methods for objects of class to access
    public default void classObjAccess() {
        System.out.println("accessed via class object");
    }
}
