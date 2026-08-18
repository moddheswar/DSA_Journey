import java.util.*;

public class FennecVsSnuke{
    static void bfs(int n, Map<Integer,List<Integer>> map,int[][] arr){
        Queue<int[]> que = new LinkedList<>();
        boolean[] vis = new boolean[arr.length];
        int[] init = {n,0};
        que.offer(init);
        while(!que.isEmpty()){
            int[] pol = que.poll();
            int x = pol[0];
            int s = pol[1];
            
            if(arr[x][1] > s){
                arr[x][0] = n;
                arr[x][1] = s;                
            }
            
            vis[x] = true;
            if(map.containsKey(x)){
                List<Integer> a = map.get(x);
                for(int i:a){
                    if(vis[i] == true){
                        continue;
                    }
                    int[] temp = new int[]{i,s+1};
                    que.offer(temp);
                }
            }
            else{
                continue;
            }
            
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n - 1;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(map.containsKey(a)){
                map.get(a).add(b);
            }
            else{
                map.put(a,new ArrayList<>());
                map.get(a).add(b);
            }
            if(map.containsKey(b)){
                map.get(b).add(a);
            }
            else{
                map.put(b,new ArrayList<>());
                map.get(b).add(a);
            }
        }
        int[][] arr = new int[n + 1][2];
        for(int i=1;i<=n;i++){
            arr[i][1] = Integer.MAX_VALUE;
        }
        
        bfs(1,map,arr);
        bfs(n,map,arr);

        int f = 0;
        int s = 0;
        for(int i=1;i<=n;i++){
            if(arr[i][0] == 1){
                f++;
            }
            else if(arr[i][0] == n){
                s++;
            }
        }
        if(f>s){
            System.out.println("Fennec");
        }
        else{
            System.out.println("Snuke");
        }
        sc.close();
    }
}