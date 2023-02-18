import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) throws IOException{
	
		Scanner br = new Scanner(System.in);
		
	    String line = br.nextLine();
	    Complete obj = new Complete();
	    boolean ans = obj.saveIronman(line);
    	
    	if(ans == true)
    	    System.out.println("YES");
	    else
	        System.out.println("NO");
	}
}


class Complete{
    
   
    // Function for finding maximum and value pair
    public static boolean saveIronman (String s) {
        //Complete the function
        String str = s.replaceAll("[^a-zA-Z0-9]","");
        str = str.toLowerCase();
            
        int start = 0;
        int end = str.length()-1;
        
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
                start++;
                end--;
        }
        return true;
    }
}
