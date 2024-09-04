import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        // System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);

        // factorial of a number
        System.out.println("enter a number for whom you want the factorial: ");

        int n = sc.nextInt();
        int fact = 1;

        for(int i = n; i >= 1; i--) {
            fact *= i;
        }

        System.out.println(fact);

        sc.close(); // destroying the created object
    }
}