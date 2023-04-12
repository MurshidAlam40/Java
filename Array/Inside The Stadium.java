import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int n = sc.nextInt();
		    int runs[] = new int[n];
		    
		    for(int i=0; i<n; i++){
		        runs[i] = sc.nextInt(); 
		    }
		    
		    System.out.println(strikeRate(runs, n));
		}
	}
	
	static int strikeRate(int runs[], int n){
	    
	    int count = 0;
        int totalRuns = 0;
        int totalBalls = 0;
        for(int i=0; i<n; i++){
            totalBalls++;
            totalRuns += runs[i];
            double strike = (totalRuns*100.0) / totalBalls;
            if(strike == 100.0){
                count++;
            }
        }
        return count;
	} 
}
