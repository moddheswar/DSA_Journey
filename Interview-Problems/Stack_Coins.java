import java.util.*;

public class Stack_Coins {
    static class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first = first;
            this.second = second;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Pair> stk = new Stack<>();
        int max = 0;
        for(int i=1;i<=N;i++){
            int coin = sc.nextInt();
            max=Math.max(max,coin);
            while(!stk.isEmpty() && stk.peek().first <= coin){
                max = Math.max(max,( i - stk.pop().second) * coin);
            }
            Pair np = new Pair(coin,i);
            stk.push(np);
        }
        System.out.println(max);
        sc.close();
    }
}
