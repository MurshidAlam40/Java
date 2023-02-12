import java.util.*;
 
class IncreasingSubarray {
     
    public static int increasing_subarray(int arr[],int n){
        // Create two arrays pre and pos
        int pre[] = new int[n] ;
        int pos[] = new int[n] ;
        pre[0] = 1;
        pos[n - 1] = 1;
        int l = 0;
     
        // Find out the contribution of the current
        // element in array[0, i] and update pre[i]
        for (int i = 1; i < n; i++){
            if (arr[i] > arr[i - 1])
                pre[i] = pre[i - 1] + 1;
            else
                pre[i] = 1;
        }
     
        // Find out the contribution of the current
        // element in array[N - 1, i] and update pos[i]
        l = 1;
        for (int i = n - 2; i >= 0; i--)
        {
            if (arr[i] < arr[i + 1])
                pos[i] = pos[i + 1] + 1;
            else
                pos[i] = 1;
        }
     
        // Calculate the maximum length of the
        // strictly increasing subarray without
        // removing any element
        int ans = 0;
        l = 1;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > arr[i - 1])
                l++;
            else
                l = 1;
            ans = Math.max(ans, l);
        }
     
        // Calculate the maximum length of the
        // strictly increasing subarray after
        // removing the current element
        for (int i = 1; i <= n - 2; i++)
        {
            if (arr[i - 1] < arr[i + 1])
                ans = Math.max(pre[i - 1] +pos[i + 1], ans);
        }
        return ans;
    }
     
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println(increasing_subarray(arr, n));
         
    }
}
