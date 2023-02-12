import java.util.*;

public class Beauty{
    public static int beauty(int n, int m, String S, int[] X, int[] Y){
        HashMap<Character, Integer> count = new HashMap<>();
        int[] value = new int[n];
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            char c = S.charAt(i);
            if(!count.containsKey(c)){
                count.put(c, 1);
            }
            else{
                count.put(c, count.get(c) + 1);
            }
        }
        
        for(int i=0; i<n; i++){
            value[i] = count.get(S.charAt(i));
        }
        
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int i=0; i<m; i++){
            graph.get(X[i] - 1).add(Y[i] - 1);
        }
        
        int beautyPath = 0;
        for(int i=0; i<n; i++){
            beautyPath = Math.max(beautyPath, value[i]);
        }
        
        if(beautyPath == 1){
            return -1;
        }
        
        boolean[] vis = new boolean[n];
        int ans = -1;
        
        for(int i=0; i<n; i++){
            if(!vis[i] && value[i] == beautyPath){
                ArrayList<Integer> st = new ArrayList<>();
                st.add(i);
                
                while(!st.isEmpty()){
                    int node = st.get(st.size() - 1);
                    st.remove(st.size() - 1);
                    if(!vis[node]){
                        vis[node] = true;
                        for(int elem : graph.get(node)){
                            if(!vis[elem]){
                                st.add(elem);
                            }
                        }
                    }
                }
                ans = beautyPath;
                break;
            }
        }
        return ans;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String S = sc.next();
        
        int[] X = new int[m];
        int[] Y = new int[m];
        
        for(int i=0; i<m; i++){
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        
        System.out.println(beauty(n, m, S, X, Y));
    }
}
