import java.io.*;
import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Main obj = new Main();
		System.out.println(obj.firstRepeatCharacter(str));
	}
	
	public int firstRepeatCharacter(String str){
	    HashSet<Character> hs = new HashSet<>();
	    for(int i=1; i<=str.length(); i++){
	        char ch = str.charAt(i);
	        if(hs.contains(ch)){
	            return str.indexOf(ch);
	            //return i; //return the last index of repeating character
	        }
	        else{
	            hs.add(ch);
	        }
	    }
	    return -1;
	}
}

/*
Input : abcdab
Output : 1
*/
