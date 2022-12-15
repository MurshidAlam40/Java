import java.io.*;
import java.util.*;
class Mathematics {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		
	    Solution  obj=new Solution ();
	    int A,B;
	    
	    //taking A and B
	    A=sc.nextInt();
	    B=sc.nextInt();
	    int N;
	    
	    //taking N
	    N=sc.nextInt();
	    
	   System.out.println((int)Math.floor(obj.termOfGP(A,B,N)));
	}
}

class Solution
{
    
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
      double a = A;
      double b = B;
      double ans = 0;
      if(N == 1)
          ans = A;
      
      else{    
          ans = A*Math.pow((b/a),N-1);
      }
      return ans;
    }
}
