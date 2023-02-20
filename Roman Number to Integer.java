import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String roman = sc.next();
        Solution ob = new Solution();
        System.out.println(ob.romanToDecimal(roman)); 
    }
}



class Solution {
    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here
        int res = 0;
 
        for (int i = 0; i < str.length(); i++) {
          
            int s1 = value(str.charAt(i));
 
           
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));
                if (s1 >= s2) {
                    res = res + s1;
                }
                else {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else {
                res = res + s1;
            }
        }
        return res;
    }
}
