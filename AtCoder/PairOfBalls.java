import java.util.*;

public class PairOfBalls{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        List<Queue<Integer>> que=new ArrayList<>();
        List<List<Integer>> map=new ArrayList<>();
        for(int i=0;i<=N;i++) map.add(new ArrayList<>());
        for(int i=0;i<M;i++){
            int k=sc.nextInt();
            que.add(new LinkedList<>());
            for(int j=0;j<k;j++){
                int temp=sc.nextInt();
                que.get(i).offer(temp);
                map.get(temp).add(i);
            }
        }
        Queue<Integer> ready=new LinkedList<>();
        for(int i=1;i<=N;i++){
            int a=map.get(i).get(0);
            int b=map.get(i).get(1);

            if(que.get(a).peek()==i && que.get(b).peek()==i){
                ready.offer(i);
            }
        }
        int count=0;
        while(!ready.isEmpty()){
            int temp=ready.poll();
            int a=map.get(temp).get(0);
            int b=map.get(temp).get(1);
            if(que.get(a).isEmpty() || que.get(b).isEmpty()){
                continue;
            }
            if(que.get(a).peek()!=temp || que.get(b).peek()!=temp){
                continue;
            }
            que.get(a).poll();
            que.get(b).poll();
            count+=2;
            if(!que.get(a).isEmpty()){
                int j=que.get(a).peek();
                int x=map.get(j).get(0);
                int y=map.get(j).get(1);
                if(que.get(x).peek()==j && que.get(y).peek()==j){
                    ready.offer(j);
                }
            }
            if(!que.get(b).isEmpty()){
                int j=que.get(b).peek();
                int x=map.get(j).get(0);
                int y=map.get(j).get(1);
                if(que.get(x).peek()==j && que.get(y).peek()==j){
                    ready.offer(j);
                }
            }
        }
        System.out.println(count==2*N ? "Yes" : "No");
        sc.close();
    }
}