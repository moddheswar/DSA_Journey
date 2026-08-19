import java.util.*;

public class Bread{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long L = sc.nextLong();
        long sum = 0;
        Queue<Long> que = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            long inp = sc.nextLong();
            sum += inp;
            que.offer(inp);
        }
        if(sum != L){
            que.offer(L - sum);
        }
        long res = 0;
        while(que.size() > 1){
            long temp = que.poll() + que.poll();
            res += temp;
            que.offer(temp);
        }
        System.out.println(res);
        sc.close();
    }
}