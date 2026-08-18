import java.util.*;

public class SortingQueries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> arr = new PriorityQueue<>();
        while(q-->0){
            int qt = sc.nextInt();
            if(qt == 1){
                int x = sc.nextInt();
                que.offer(x);
            }
            else if(qt == 2){
                if(!arr.isEmpty()){
                    System.out.println(arr.poll());
                }
                else{
                    System.out.println(que.poll());
                }
            }
            else{
                while(!que.isEmpty()){
                    int x = que.poll();
                    arr.offer(x);
                }
            }
        }
        sc.close();
    }
}