import java.util.*;
import java.lang.*;

class elements{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            Stack<Integer> st = new Stack<Integer>();
            int n = sc.nextInt();
            for(int i = 0; i < n; i++)
            {
                int temp = sc.nextInt();
                st.push(temp);
            }
            
            Solution obj = new Solution();
            
            if(obj.pairWiseConsecutive(st) == true)
                System.out.println("Yes");
            else
                System.out.println("No");
            
        }
    }
}


class Solution{
    public static boolean pairWiseConsecutive(Stack<Integer> st){
        // Your code here
        Stack<Integer> stack = new Stack<>();
        
        while(!st.isEmpty()){
            stack.push(st.peek());
            st.pop();
        }
        
        while(stack.size() > 1){
            int prev = stack.peek();
            stack.pop();
            int curr = stack.peek();
            stack.pop();
            
            if(Math.abs(prev - curr) != 1)
                return false;
             // Push the elements to original stack.    
            st.push(prev);
            st.push(curr);
        }
        if(stack.size() == 1) 
            st.push(stack.peek());
        return true;
	}
}
