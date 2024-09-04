public class stringMethods {
    public static void main(String[] args) {
        String name = "Himadri Das";

        int length = name.length(); // str.length()
        System.out.println(length);

        char ch = name.charAt(3); // str.charAt()
        System.out.println(ch);

        String name2 = "Himadri das";

        // System.out.println(name == name2); // == in non-primitive: checks for address && NOT value

        System.out.println(name.equals(name2)); // str.equals(str2) : for checking value

        System.out.println(name.equalsIgnoreCase(name2)); // ignore the case



        String str1 = "remote", str2 = "ramote"; 

        // System.out.println('e' + 0);  // to find the ascii
        // System.out.println('a' + 0); 

        System.out.println(str1.compareTo(str2)); // compareTo: compare the string char by char && returns the difference in ASCII of the 1st different character.
        // e-a


        String name3 = "Anuranjan Maharaj";
        System.out.println(name3.length());
        System.out.println(name3.substring(5, 16));

        String toTrim = "   babu    ";
        String trimmedString = toTrim.trim();

        System.out.println(toTrim == trimmedString); // false

        System.out.println(toTrim.trim());
    }
}
