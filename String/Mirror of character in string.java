import java.util.Scanner;
class main
{
	public static void main (String[] args)
	{
		Scanner read = new Scanner(System.in);
		
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		String a = read.next();
    		// Update your code below to solve this problem
    		/*
            String ans = "";
            String opposite = "zyxwvutsrqponmlkjihgfedcba";
            
            for(int j=0; j<a.length(); j++){
                ans = ans + opposite.charAt(a.charAt(j) - 'a');
            }
            System.out.println(ans);
            */
            StringBuilder ans = new StringBuilder();
            
            for(int j=0; j<a.length(); j++){
                char ch = a.charAt(j);
                char opposite = (char)('a' + 'z' - ch);
                ans.append(opposite);
            }
            System.out.println(ans.toString());
		}
	}
}
