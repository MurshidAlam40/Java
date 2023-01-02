import java.io.*;
class GFG{
// complete the function
// the function should return the reversed string
public static String reverseString(String s){
    // code here
    String rev = "";
    int str = s.length() - 1;
    
    while(str >= 0){
        rev = rev + s.charAt(str);
        str--;
    }
    return rev;
    
}
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        String s = read.readLine().trim();
        String reversed = reverseString(s);
        System.out.println(reversed);
    }
}
