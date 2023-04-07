import java.util.*;
import java.io.*;
class Abc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a[],b;
        a= new int[n][n];
        b= new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int p=sc.nextInt();
                a[i][j]=p;
            }
        }
        int Max=0;
        for(int i=0;i<n;i++)
        {
            int p=sc.nextInt();
            b[i]=p;
        }
        
        Complete obj = new Complete();
        ArrayList<Integer> ans;
        ans = obj.array(a, b, n);
        for(int i: ans){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = 0;
        //find the sum of the left diagonal values of the 2-d array
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j){
                    sum += a[i][j];
                }
            }
        }
        //add sum in arraylist
        ans.add(sum);
        
        int max = b[0];
        //find max element of the 1-d array
        for(int i=0; i<n; i++){
            if(b[i] > max)
                max = b[i];
        }
        //add element in arraylist
        ans.add(max);
        
        return ans;
    }
}
