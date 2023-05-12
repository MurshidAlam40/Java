import java.util.*;

class Main
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
      String a= read.next();
      for(int j=0; j<a.length(); j++){
          // To find ASCII value, store the character in an integer variable.
          int ascii = a.charAt(j);
          System.out.print(ascii + " ");
      }
      System.out.print("\n");
	}
}
