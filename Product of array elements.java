mport java.util.*;

class Product
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        Long arr[] = new Long[n];

        for(int i = 0; i < n; i++)
          arr[i] = sc.nextLong();

          Long mod = 1000000007L;
          GfG gfg = new GfG();
              System.out.println(gfg.product(arr, mod, n));
    }
}

/*  
     arr[] is the array
     n = number of element in array
     mod = modulo value;
*/
class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        //yout code here
        long prod = 1;
        
        for(int i=0; i<n; i++){
            prod = prod*arr[i] % mod;
        }
        return prod;
    }
}
