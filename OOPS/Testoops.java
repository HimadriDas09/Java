package OOPS;

public class Testoops {
    public static void main(String[] args) {
        // Cat a = new Cat();
        // a.name = "bob";

        // Cat b = makeCatUpperCase(a);
        // System.out.println(b == a);

        Student st = new Student("himadri", 63, 12);
        st.printAllValue();
        System.out.println(Student.id);

    }

    public static Cat makeCatUpperCase(Cat cat) {
        cat.name = cat.name.toUpperCase();
        return cat;
    }
}
