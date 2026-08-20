import java.util.*;

public class Chargers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        int V = sc.nextInt();
        Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for(int q=0;q<Q;q++){
            int qt = sc.nextInt();
            int tm = sc.nextInt();
            if(qt == 1){
                int v = sc.nextInt();
                que.offer(v - tm);
            }
            else if(qt==2){
                if(que.isEmpty()){
                    System.out.println(-1);
                    continue;
                }
                int x = que.poll() + tm;
                if(x>V){
                    System.out.println(V);
                }
                else{
                    System.out.println(x);
                }
            }
        }

        sc.close();
    }
}