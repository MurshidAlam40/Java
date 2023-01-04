import java.io.*;
import java.util.*;

class Main {
public static char extraChar(String s1, String s2){

    //write your code here
    int sum1 = 0;
    int sum2 = 0;
    
    for(int i=0; i<s1.length(); i++){
        int ascii = s1.charAt(i);//calculating total of the ASCII values of characters in s1
        sum1 += ascii;
    }
    for(int j=0; j<s2.length(); j++){
        int ascii = s2.charAt(j);//calculating total of the ASCII values of characters in s2
        sum2 += ascii;
    }
    return (char)(sum2 - sum1);
}
    public static void main(String[] args) throws IOException
    {
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        String s1 = read.readLine().trim();
        String s2 = read.readLine().trim();
        System.out.println(extraChar(s1, s2));
    }
}
