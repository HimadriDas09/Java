1. string is not a 'primitive' datatype. It is a class.

    - So 'Strings' are Objects.

    - what is string pool ? 

        - String Pool is a special area in the heap memory managed by the JVM.

        - This pool is designed to save memory by storing only one copy of UNIQUE string literal.

            - i.e strings created using 'new' are NOT stored in string pool.

        - JVM automatically managed the lifecycle of the strings in the pool, including garbage collection when strings are no longer needed.

    ``` java

        String str = "abc"; // String created using literal: stored in String Pool.
        String str2 = "abc"; /* 
        1st we create a String, it is checked if this string already exists in the string pool or not
         */

        System.out.print(str == str2) // true: bcz str,str2 points to the same string object created in String Pool.

        String s1 = new String("def");
        String s2 = new String("def");

        s1 == s2 // false
        // bcz in both the cases: a NEW String Object is created, which is present in 'heap' but outside the STRING POOL.

    ```

2. String Methods: 

    ```java

    String name = "himadri das", name2 = "abcdef";

    name.length()
    name.charAt(2)

    name.equals(name2) // compares char by char 
    name.equalsIgnoreCase(name2)

    name.compareTo(name2) // difference between ascii of 1st different character
    name.compareToIgnoreCase(name2)

    // NOTE: each of the below methods return a new String, which is stored in the String Pool. JVM manages it's garbage collection. So when Strings are not required anymore they are garbage collected.

    name.substring(begInd, endInd); // begInd: inclusive, endInx: is excluded.

    name.toUpperCase()
    name.toLowerCase()

    name.trim() // whitespace from beg and end

    name.replace(subst/character to find, substring/character to replace it with) // returns a new String, no changes in original string.

    name.contains(substring/character) // to check if a substring/char is present is a string/not.

    name.startsWith(str)
    name.endsWith(str)

    str.isEmpty() // " " -> false
    str.isBlank() // " " -> true
    
    str.indexOf('i') // 1st index at which 'i' appears.

    ```

3. Object(i.e non primitive data type) created using 'new' keyword: 

    - Object is also created in the 'HEAP' memory. With the variable holding it's reference present in the 'STACK' memory.

    ``` java
        String str = new String("aman");
        // str is present in 'stack' memory, containing the reference of the String Object present in 'heap'.

        int[] arr = new int[10];
        // A 10 sized array object is created in 'heap', with arr: holding the reference i.e a hexadecimal code i.e hash code, present in stack.

        // NOTE: in (int) array by default: all element holds 0.

        // NOTE: 'length' is a property in array object.
    ```

4. Arrays:
    ``` java

        // 1 d array
        int[] arr = {1,2,3};

        int[] arr2 = new int[3];

        // 2d array: i.e Array of Arrays
        int[][] arr3 = new int[3][4];

        // jagged array: i.e Array of different length arrays
        int[][] arr4 = new int[3][]; 

        arr4[0] = new int[1];
        arr4[1] = new int[2];
        arr4[2] = new int[3];

    ```


