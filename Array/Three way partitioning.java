import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int array[] = new int[N];
        Map<Integer, Integer> mp = new HashMap<>();
        
        
        for(int i=0;i<N;i++){
            array[i] = in.nextInt();
            if (mp.containsKey(array[i]))  
            { 
                mp.put(array[i], mp.get(array[i]) + 1); 
            }  
            else
            { 
                mp.put(array[i], 1); 
            } 
        }
        
        
        int a = in.nextInt();
        int b = in.nextInt();
    
        int original[] = new int[N];
        
        for(int i=0; i<N;i++)
        {
            original[i] = array[i];
        }

        int k1=0,k2=0,k3=0;
        int kk1=0;int kk2=0;int kk3=0;

        for(int i=0;i<N;i++)
        {
            if(original[i]>b)
                k3++;
            else if(original[i]<=b && original[i]>=a)
                k2++;
            else if(original[i]<b)
                k1++;
        }
        Solution ob = new Solution();
        ob.threeWayPartition(array,a,b);

        for(int i=0;i<k1;i++)
        {
            if(array[i]<b)
            kk1++;
        }
        
        for(int i=k1;i<k1+k2;i++)
        {
            if(array[i]<=b && array[i]>=a)
            kk2++;
            
        }
        
        for(int i=k1+k2;i<k1+k2+k3;i++)
        {
            if(array[i]>b)
            kk3++;
        }
        Boolean ok = false;
        if(k1==kk1 && k2 ==kk2 && k3 == kk3)
            ok = true;

        for(int i=0;i<array.length;i++)
            mp.put(array[i], mp.get(array[i]) - 1);
        
        for(int i=0;i<array.length;i++)
            if(mp.get(array[i])!=0)
                ok=false;
        
        if(ok)
            System.out.println(1);
        else
            System.out.println(0);
    }
}


class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here
        /*
        Arrays.sort(array);
        */
        //Sec Method
        
        int n = array.length;
        int left = 0, right = n - 1;
        
        for (int i=0; i<n; i++) {
			  if(array[i] < a) {
				int temp = array[i];
				array[i] = array[left];
				array[left] = temp;
				left++;
			}
		}
		
		int i = left;
		while (i <= right) {
		    if(array[i] > b) {
		        int temp = array[i];
            array[i] = array[right];
            array[right] = temp;
            right--;
		    }
		    else{
		        i++;
		    }
		  }
    }
}
