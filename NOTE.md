0. 
1. string is not a 'primitive' datatype. It is a class.

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
 
```