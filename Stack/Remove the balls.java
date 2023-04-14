import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
            
        int[] color =new int[N];
        for(int i=0; i<N; i++){
            color[i] = sc.nextInt();
        }
        
        int[] radius = new int[N];
        for(int i=0; i<N; i++){
            radius[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int res = obj.finLength(N, color, radius);
        
        System.out.println(res);
    }
}

class Solution {
    public static int finLength(int N, int[] color, int[] radius) {
        // code here
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<N; i++){
            if(!st.isEmpty()){ // or st.size() != 0
                int index = st.peek();
                
                if(color[index] == color[i] && radius[index] == radius[i]){
                    st.pop();
                }
                else
                    st.push(i);
            }
            else
                st.push(i);
        }
        return st.size();
    }
}
        



class Sol
{
    Boolean balancedNumber(String N)
    {
        // your code here 
        int low = 0;
        int high = N.length()-1;
        int mid = low + (high - low)/2;
        int LHS = 0; int RHS = 0;
        
        for(int i=0; i<mid; i++){
            LHS += N.charAt(i) - '0';
        }
        
        for(int i=high; i>mid; i--){
            RHS += N.charAt(i)- '0';
        }
        
        if(LHS == RHS){
            return true;
        }
        return false;
    }
}
