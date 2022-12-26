import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();

      //creating an object of class Geeks	
    Geeks obj=new Geeks();
    obj.isDivisibleByPrime(n);
		}
	
		
	}
}

class Geeks {
	 static void isDivisibleByPrime (int n) 
	 {
         //Your code here
         if(n%11==0){
             System.out.println("Eleven");
         }
         else if(n%3==0){
             System.out.println("Three");
         }
         else if(n%2==0){
             System.out.println("Two");
         }
         else{
             System.out.println("-1");
         }
    }

}
