import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
    Scanner sc = new Scanner(System.in);
		  
	String s = sc.nextLine();
    
    Solution obj = new Solution();
    
    System.out.println(obj.findSum(s));
   }
}


class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        String temp = "0";
        int sum = 0;
 
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
 
            if(Character.isDigit(ch))
                temp += ch;
 
            else{
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        sum += Integer.parseInt(temp);
        return sum;
    }
    
}
