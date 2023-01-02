import java.io.*;
class GFG{
public static int findPattern(String s, String p){
    // code here
    int pos = s.indexOf(p);
    while(pos >= 0){
        
        return pos;
    }
    return -1;
}
    public static void main(String args[])throws IOException{
        BufferedReader read = new BufferedReader( new InputStreamReader(System.in));
        String s = read.readLine().trim();
        String p = read.readLine().trim();
        
        int index = findPattern(s, p);
        System.out.println(index);
    }
}
