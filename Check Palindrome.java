import java.io.*;
class GFG{
public static boolean isPalin(String s){
    // code here
    int start = 0;
    int end = s.length() - 1;
    s = s.toLowerCase();
    boolean isPal = true;
    
    while(start < end){
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
}
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        String s = read.readLine().trim();
        
        boolean palindrome = isPalin(s);
        if(palindrome)
        System.out.println("True");
        else
        System.out.println("False");
    }
}
