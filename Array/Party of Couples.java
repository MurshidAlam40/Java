import java.util.*;

public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Solution ob = new Solution();
        System.out.println(ob.findSingle(n, arr));
    }
}

class Solution{
    static int findSingle(int N, int arr[]){
        // code here
        /*
        for(int i=0; i<N; i++){
            int count = 0;
            for(int j=0; j<N; j++){
                if(arr[i] == arr[j])
                    count++;
            }
            if(count%2 == 1)
                return arr[i];
        }
        return -1;
        */
        
        //Use XOR operation:
        
        int ans = 0;
        
        for(int i=0; i<N; i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
