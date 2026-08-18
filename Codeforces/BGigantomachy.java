import java.util.*;

public class BGigantomachy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=0;i<m;i++){
                b[i] = sc.nextInt();
            }
            long a1 = 0;
            for(int i=0;i<n;i++){
                if(i == n-1){
                    a1 += a[i];
                }
                else{
                    a1 += a[i] - a[i+1] + 1;
                }
            }
            long a2 = 0;
            for(int i=0;i<m;i++){
                if(i == m-1){
                    a2 += b[i];
                }
                else{
                    a2 += b[i] - b[i+1] + 1;
                }
            }
            if(a1>=a2){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }
        }
        sc.close();
    }
}