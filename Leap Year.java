import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap Year");
        }
        else if( year % 400 == 0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
