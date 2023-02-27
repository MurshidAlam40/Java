import java.util.*;


class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		String str = sc.nextLine();
		Solution g = new Solution();
		boolean b = g.isBinary(str);
		if(b== true)
			System.out.println(1);
		else
		    System.out.println(0);
	}
}



class Solution
{
	boolean isBinary(String str)
	{
	  //Your code here
	  
	  for(int i=0; i<str.length(); i++){
	      char num = str.charAt(i);
	      if(num > '1')
	        return false;
	  }
	  return true;
	}
}
