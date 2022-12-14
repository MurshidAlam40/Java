import java.io.*;
import java.util.*;

class GFG {
    
    // Driver Code
    public static void main (String[] args) {
	    
	       //Creating an object of class Geeks
	       Geeks g = new Geeks();
		
		   //Calling the IOFunction() of class Geeks
		   g.IOFunction();
	}
}
//User function Template for Java

class Geeks{
    
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      while(t-- > 0){

          // Your code here
          int a = sc.nextInt();
          System.out.println(a);

          float b = sc.nextFloat();
          System.out.println(b);

          long c = sc.nextLong();
          System.out.println(c);

          byte d = sc.nextByte();
          System.out.println(d);

          sc.nextLine();

          String s = sc.nextLine();
          System.out.println(s);
      }
    }
}
