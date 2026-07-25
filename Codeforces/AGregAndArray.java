import java.util.*;

public class AGregAndArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int O = sc.nextInt();
        int Q = sc.nextInt();
        long[] arr = new long[N + 3];
        long[] sum = new long[N + 3];
        for(int i=1;i<N+1;i++){
            arr[i] = sc.nextInt();
        }
        int[][] op = new int[O][3];
        for(int i=0;i<O;i++){
            op[i][0] = sc.nextInt();
            op[i][1] = sc.nextInt();
            op[i][2] = sc.nextInt();
        }
        for(int i=0;i<Q;i++){
            int q = sc.nextInt();
            int n = sc.nextInt();
            for(int k=q;k<=n;k++){
            sum[op[k - 1][0]] +=  op[k-1][2];
            sum[op[k - 1][1] + 1] -=  op[k-1][2];

            }
        }
        int pre = 0;
        System.out.println();
        for(int i=1;i<N+1;i++){
            pre+=sum[i];
            System.out.print((arr[i] + pre)+" ");
        }
        
        sc.close();
    }
}
