import java.util.*;

public class WeirdArray{
    public static int weird_array(int[] array){
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i : array){
            if(frequency.containsKey(i)){
                frequency.put(i, frequency.get(i) + 1);
            }
            else{
                frequency.put(i, 1);
            }
        }
        int maxFrequency = 0;
        int maxElement = 0;
        
        for(int key : frequency.keySet()){
            if(frequency.get(key) > maxFrequency){
                maxFrequency = frequency.get(key);
                maxElement = key;
            }
        }
        if(maxFrequency == 1){
            return 0;
        }
        int result = array.length;
        int currCount = 0;
        
        for(int i=0; i<array.length; i++){
            if(array[i] == maxElement){
                currCount++;
            }
            else{
                currCount = 0;
            }
            if(currCount == maxFrequency){
                result = Math.min(result, i+1);
                break;
            }
        }
        return result - maxFrequency + 1;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }
        
        int ans = weird_array(array);
        
        System.out.println(ans);
    }
}
