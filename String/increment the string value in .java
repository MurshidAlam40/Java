import java.util.Scanner;

public class StringTransformer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        System.out.println(transformString(str));
    }

    public static String transformString(String str) {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                int newDigit = (digit + 1) % 10;
                sb.append(newDigit);
            }
            else if(Character.isLetter(c)){
                char newChar = (char) (c + 1);
                if (newChar > 'Z' && newChar < 'a') {
                    newChar = 'A';
                } else if (newChar > 'z') {
                    newChar = 'a';
                }
                sb.append(newChar);
            }
        }
        return sb.toString();
    }
}
