import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();
    
        Solution obj = new Solution();
        System.out.println(obj.isIsogram(data)?"1":"0");
    }
}



class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        
        ArrayList<Character> arr = new ArrayList<>();

        for(int i =0; i<data.length(); i++){
            if(arr.contains(data.charAt(i))){
                return false;
            }
            else{
                arr.add(data.charAt(i));
            }
        }
        return true;
    }
}
