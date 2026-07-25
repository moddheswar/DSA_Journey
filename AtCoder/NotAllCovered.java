import java.util.*;

public class NotAllCovered{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+2];
        int min = Integer.MAX_VALUE;
        int M = sc.nextInt();
        for(int i=0;i<M;i++){
            int st = sc.nextInt();
            int ed = sc.nextInt();
            arr[st] += 1;
            arr[ed + 1] -=1;
        }
        int pre_sum = 0;
        for(int i=1;i<N+1;i++){
            pre_sum+=arr[i];
            min = Math.min(pre_sum,min);
        }
        System.out.println(min);
        sc.close();
    }
}