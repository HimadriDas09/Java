public class testString {
    public static void main(String[] args) {

        /* 
        NOTE: 
        - String is class, so objects are created.

         NOTE: 

         - what is string pool ? 

         ans) String Pool is a special area in the heap memory managed by the JVM.

         This pool is designed to save memory by storing only one copy of UNIQUE string literal.

         JVM automatically managed the lifecycle of the strings in the pool, including garbage collection when strings are no longer needed.


         NOTE: 

         - using 'new' keyword, an object is created in 'heap' memory.
         */
        
        String x = "Ram"; /* String "Ram" is created and stored in 'String Pool', reference of the string is stored in 'x' */

        String a = new String("Ram"); /* a new String is created and reference is stored in 'a' */

        String b = new String(x);

        String c = "Ram"; /* A new String is not created. 'c' point to already created String "Ram" in the String Pool */
        String d = "Ram";

        // below: we're not doing value comparison, rather address comparison.

        System.out.println(x == c); // true
        System.out.println(a == b); // false
        System.out.println(c == d); // true

    }
}
