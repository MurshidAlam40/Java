import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        String S[] = read.readLine().split(" ");

        int d = Integer.parseInt(S[0]);
        int m = Integer.parseInt(S[1]);
        int y = Integer.parseInt(S[2]);

        Solution ob = new Solution();
        System.out.println(ob.isValidDate(d,m,y));
    }
}

class Solution {
    static int isValidDate(int d, int m, int y) {
        // code here
        if(y > 9999 || y < 1800)
            return 0;
            
        if(m<1 || m>12 || d<1 || d>31)
            return 0;
        //February month  with leap year 
        if(m == 2){
            if(isLeap(y)){
                if(d <= 29)
                    return 1;
                else
                    return 0;
            }
            else{
                if(d <= 28)
                    return 1;
                else
                    return 0;
            }
        }
        // Months of April, June,Sept and Nov must have number of days less than
        // or equal to 30.
        if(m == 4 || m == 6 ||
            m == 9 || m == 11){
                if(d <=30)
                    return 1;
                else
                    return 0;
            }
        return 1;
    }
    
    //Cheak the year is leap or not
    static boolean isLeap(int year){
        return(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0));
    }
};
