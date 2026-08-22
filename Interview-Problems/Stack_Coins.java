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
        int N=sc.nextInt();
        Stack<Pair> stk=new Stack<>();
        int max=0;
        for(int i=0;i<=N;i++){
            int coin=(i==N)?0:sc.nextInt();
            int start=i;
            while(!stk.isEmpty() && stk.peek().first>coin){
                Pair p=stk.pop();
                max=Math.max(max,p.first*(i-p.second));
                start=p.second;
            }
            stk.push(new Pair(coin,start));
        }
        
        System.out.println(max);
        sc.close();
    }
}
