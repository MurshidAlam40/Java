import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    String a = line.split(" ")[0];
    String b = line.split(" ")[1];

    GfG g = new GfG();
    System.out.println(g.strstr(a,b));
			
	}
}
class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x){
       // Your code here
   
       if(s.contains(x)){
           return s.indexOf(x);
       }
       return -1;
    }
}
