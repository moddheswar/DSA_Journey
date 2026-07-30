import java.util.*;

public class unbelievable_Array {
    static int find(int[] leader,int node){
        if(leader[node] == node){
            leader[node] = leader[leader[node]]; 
            return node;
        }
        return leader[node] = find(leader,leader[node]);
    }
    static void join(int[] leader, int x, int y){
        int px = find(leader, x);
        int py = find(leader, y);

        if(px != py)
            leader[px] = py;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int t = 0;
        while(T-->0){
            t++;
            int N = sc.nextInt();
            int Q = sc.nextInt();
            int[] arr = new int[N+1];
            for(int i=1;i<N+1;i++){
                arr[i] = sc.nextInt();
            }
            int[] leader = new int[100001];
            for(int i=0;i<100001;i++){
                leader[i] = i;
            }
            System.out.println("Case "+t+":");
            for(int i=0;i<Q;i++){
                int q = sc.nextInt();
                if(q == 2){
                    System.out.println(find(leader,arr[sc.nextInt()]));
                }
                else if(q == 1){
                    int u = sc.nextInt();
                    int v = sc.nextInt();

                    if(find(leader,u) == u){
                        if(find(leader,v) == u){
                            leader[v] = v;
                            leader[u] = v;
                        }
                        join(leader,u,v);
                    }
                }
            }
        }
        sc.close();
    }
}
