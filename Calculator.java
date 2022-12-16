import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int operator = scn.nextInt();
        utility(a, b, operator);
        System.out.println();
    }
    public static void utility(int a, int b, int operator){

    //write your code here
    if(operator == 1){
        System.out.print(a + b);
    }
    else if(operator == 2){
        System.out.print(a - b);
    }
    else if(operator == 3){
        System.out.print(a * b);
    }
    else{
        System.out.print("Invalid Input");
    }
}
}
