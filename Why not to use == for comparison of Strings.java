/*
In general both equals() and “==” operator in Java are used to compare objects to check equality but here are some of the differences between the two:

Main difference between .equals() method and == operator is that one is a method and other is a operator.
One can use == operators for reference comparison (address comparison) and .equals() method for content comparison.
In simple words, == checks whether both objects point to the same memory location whereas .equals() evaluates the comparison of values in the objects. Example:

*/

// Java program to understand
// why to avoid == operator

public class Test {
    public static void main(String[] args)
    {
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");

        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));
    }
}


/*
Output:
false
true
  
  
Explanation: 
Here two String objects are being created namely s1 and s2.
Both s1 and s2 refers to different objects.
When one uses == operator for s1 and s2 comparison then the result is false as both have different addresses in memory.
Using equals, the result is true because it's only comparing the values given in s1 and s2.
*/
