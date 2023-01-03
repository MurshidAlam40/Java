import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine().trim();
        Solution obj = new Solution();
        obj.toBinary(n);
        System.out.println();
    }
}
class Solution
{
    public void toBinary(String N)
    {
        int n = Integer.parseInt(N);
        int [] binaryNum = new int[1000];
        int i = 0;
        
        while(n > 0){
            binaryNum[i] = n%2;
            n = n / 2;
            i++;
        }
        for(int j=i-1; j>=0; j--)
            System.out.print(binaryNum[j]);
        /*
        int n = Integer.parseInt(N);
        String s = "";
        while(n > 0){
            s = (n%2) + s;
            n = n/2;
        }
        System.out.print(s);
        */
    }
}
