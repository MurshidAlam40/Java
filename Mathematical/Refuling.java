import java.util.*;
import java.io.*;
class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
 	    Solution ob = new Solution();
	    System.out.println(ob.refueling(x));
    }
}

class Solution{
    public long refueling(int X){
        // Code your solution here.
        long stat1 = 0;
        long stat2 = 0;
        
        for(int i=0; i<X; i++){
            stat1 = (long)Math.pow(2, i);
            
            if(stat1 == X){
                return stat1;
            }
            else if(stat1 > X){
                stat2 = (long)Math.pow(2, i-1);
                
                if(Math.abs(X - stat1) == Math.abs(X - stat2)){
                    return stat1;
                }
                else if(Math.abs(X - stat1) < Math.abs(X - stat2)){
                    return stat1;
                }
                else{
                    return stat2;
                }
            }
        }
        return -1;
    }
}
