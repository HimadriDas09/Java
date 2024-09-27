package OOPS.WrapperClasses;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        Integer b = 1; // auto boxing

        // behind the scences: boxing is
        Integer c = Integer.valueOf(1);

        int d = b; // auto unboxing

        // behind the scenes: unboxing
        int e = b.intValue();

        System.out.println(e);
        System.out.println(d);
    }
}
