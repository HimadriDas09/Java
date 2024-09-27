package OOPS;

// import java.util.*;

public class Student {
    static double id; // static field

    private String name;
    private int roll;
    private int className;

    // constructor: no data type, same as class name && is a public method
    public Student(String name, int roll, int className) {
        Student.id = Math.floor(Math.random() * 10);
        this.className = className;
        this.name = name;
        this.roll = roll;
    }

    public void printAllValue() {
        System.out.println(this.className);
        System.out.println(this.name);
        System.out.println(this.roll);
    }

}
