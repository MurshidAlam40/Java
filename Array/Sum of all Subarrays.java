import java.util.Scanner;

public class SumOfSubarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        

        System.out.println(SubArraySum(arr, n));
    }


    public static int SubArraySum(int arr[], int n){
        /*
        int sum = 0;
        for(int i=0; i<n; i++){
            int temp = 0;
            for(int j=i; j<n; j++){
                temp = temp + arr[j];
                sum = sum + temp;
            }
        }
        return sum;
        */
        int sum = 0;
        
        for(int i=0; i<n; i++){
            sum += (arr[i]*(i+1)*(n-i));
        }
        return sum;
    }
}
