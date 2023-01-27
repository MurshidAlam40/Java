import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException
	{
	        Scanner sc = new Scanner(System.in);
    
            long n = sc.nextLong();
            long a[] = new long[(int)(n)];
           
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
	}
}


class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        // arrays length = n
        long smallest = a[0];

        long secSmall = Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            if(a[i]<smallest){
                secSmall = smallest;
                smallest = a[i];
            }else if(a[i]>smallest && a[i]<secSmall){
                secSmall = a[i];
            }
        }
        if(secSmall != Integer.MAX_VALUE){
            long [] res = {smallest,secSmall};
            return res;
        }else{
               long [] res = {-1,-1};
            return res;
        }
        /*
        //secound method
        Arrays.sort(a);
        return a[0];
        rteturn a[1];
        */
    }
}
