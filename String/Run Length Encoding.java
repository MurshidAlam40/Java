import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
    Scanner sc = new Scanner(System.in);
		  
	String str = sc.nextLine();
	
	GfG g = new GfG();
	System.out.println(g.encode(str));
   }
}


// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          //Your code here
        String ans = "";
        char prev = str.charAt(0);
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char src = str.charAt(i);
            if(src == prev)
                count++;
            else{
                ans += prev+""+count+"";
                prev = src;
                count = 1;
            }
        }
        ans += prev + "" + count + "";
        
        return ans;
	}
	
 }
