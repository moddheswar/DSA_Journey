import java.util.*;

public class DistinctTrio {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int  ind = 0;ind<N;ind++){
            arr[ind] = sc.nextInt();
        }
        Arrays.sort(arr);
        long ans = 0;
        for(int ind = 0;ind<N;ind++){
            int num = arr[ind];
            int st =ind;
            while(ind < N - 1 && arr[ind + 1] == num){
                ind++;
            }
            int ed = ind;
            ans += (1L) *  (ed - st +1) * (st) * (N-1 - ed); 
        }
        System.out.println(ans);
        sc.close();
    }
}
