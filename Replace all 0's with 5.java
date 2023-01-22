import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(new GfG().convertfive(N));
    }
}

class GfG {
    int convertfive(int num) {
        // Your code here
        return num += AddedValue(num);
        
    }
    
    private static int AddedValue(int num){
        int ans = 0;
        int i = 1; //place value of the current digit
        
        if(num == 0){
           ans += (5*i);
        }
        
        while(num > 0){
           if(num % 10 == 0){
               ans += (5*i);
           }
            num = num / 10;
            i = i*10;
        }
        return ans ;
    }
}
