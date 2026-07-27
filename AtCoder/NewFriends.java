import java.util.*;

public class NewFriends{
    static int find(int[] leader, int node){
        if(leader[node] == node){
            return node;
        }
        return leader[node] = find(leader,leader[node]);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] leader = new int[N+1];
        for(int i=1;i<N+1;i++){
            leader[i] = i;
        }
        int[][] edges = new int[M][2];
        int[] grp =new int[N+1];
        int[] edg = new int[N+1];
        for(int i=0;i<M;i++){
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            int pu = find(leader, edges[i][0]);
            int pv = find(leader, edges[i][1]);

            if (pu != pv) {
                leader[pv] = pu;
            }
        }
        for(int i=1;i<=N;i++){
            grp[find(leader,i)] ++;
            
        }
        for(int[] edge: edges){
            edg[find(leader,edge[0])] ++;
        }
        long ans = 0;
        for(int i=1;i<=N;i++){
            //System.out.print(grp[i] +" "+edg[i]+" ");
            long k = grp[i];
            ans += ((k*(k-1))/2) - edg[i];
            //System.out.println(ans);
        }
        //System.out.println();
        System.out.println(ans);

        sc.close();
    }
}