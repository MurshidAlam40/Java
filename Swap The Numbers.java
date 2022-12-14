import java.util.*;
import java.io.*;
public class swapOfNumber {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Solution obj = new Solution();
        obj.Swap(a,b);
    }
}
class Solution
{
    public void Swap(int a, int b){
        //code here
        int temp;
        
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+" "+b);
    }
}

