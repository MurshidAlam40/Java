/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {

	
	static void printDivisors(int n)
	{
		int i = 1;
		for(i=1; i <= n; i++){
			if(n % i == 0){
				System.out.print(i+" ");
			}
		}
	}
	public static void main (String[] args) {
		
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
		printDivisors(n);
		System.out.println();

	}
}
