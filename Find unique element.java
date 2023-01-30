import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int a[] = new int[(int)(n)];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        Solution obj = new Solution();
        System.out.println(obj.findUnique(a, n, k));
	}
}


class Solution {
    
    public int findUnique(int a[], int n, int k)
    {
        Map<Integer, Integer> countOfValue = new HashMap<>();
        for(int num : a) {
            if(countOfValue.containsKey(num)) {
                int count = countOfValue.get(num)+1;
                countOfValue.replace(num, count);
            }  else {
                countOfValue.put(num, 1);
            }
        }
        
        int ans = 0;
        for(Map.Entry<Integer, Integer> value : countOfValue.entrySet()) {
            if(value.getValue()%k != 0) {
                ans = value.getKey();
                break;
            }
        }
        return ans;
    }
}
