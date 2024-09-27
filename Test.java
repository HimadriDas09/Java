import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        // Scanner sc = new Scanner(System.in);

        // // factorial of a number
        // System.out.println("enter a number for whom you want the factorial: ");

        // int n = sc.nextInt();
        // int fact = 1;

        // for(int i = n; i >= 1; i--) {
        //     fact *= i;
        // }

        // System.out.println(fact);

        // sc.close(); // destroying the created object

        String str = "abc";

        String str2 = "abc";

        System.out.println(str == str2); // bcz str,str2 points to same object.

        // str.charAt(1) = 'd';  is invalid bcz Strings are NOT like arrays in Java(unlike C,C++).

        System.out.println(str2); 
    }
}