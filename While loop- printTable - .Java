import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		    
    //creating an object of class Geeks
    Geeks obj=new Geeks();

    obj.printTable(n);
		}
	}
}


//User function Template for Java
class Geeks {
	 static void printTable (int n) 
	 {
            int multiplier=10;
            while(multiplier>0)
            {
                //Your code here
                System.out.print(multiplier * n+" ");
                //multiplier = multiplier - 1;
                multiplier--;
            }
       System.out.println();
	 }

}
