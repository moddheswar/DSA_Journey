import java.util.*;

public class CookiesAndGreedyTakahashi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();

        Queue<Integer> pos = new PriorityQueue<>();
        Queue<Integer> neg = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<l;i++){
            int ind = sc.nextInt();
            if(ind < 0 ){
                neg.offer(ind);
            }
            else{
                pos.offer(ind);
            }
        }

        int cur = 0;
        long dis = 0;

        while(!neg.isEmpty() && !pos.isEmpty()){
            int n = neg.peek();
            int p = pos.peek();
            int dn = Math.abs(n - cur);
            int dp = Math.abs(p - cur);
            if(dn < dp){
                dis += dn;
                cur = neg.poll();
            }
            else if(dp<dn){
                dis += dp;
                cur = pos.poll();
            }
            else{
                dis += dn;
                cur = neg.poll();
                
            }
        }
        while(!neg.isEmpty()){
            int n = neg.peek();
            dis += Math.abs(n - cur);
            cur = neg.poll();
        }
        while(!pos.isEmpty()){
            int n = pos.peek();
            dis += Math.abs(n - cur);
            cur = pos.poll();
        }
        System.out.println(dis);
        sc.close();
    }
}