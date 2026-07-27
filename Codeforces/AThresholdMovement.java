import java.util.*;

public class AThresholdMovement{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            if(n <2 || n%2 != 0){
                System.out.println("NO");
                continue;
            }
            int minr = Integer.MAX_VALUE;
            for(int i=0;i<n;i+=2){
                minr = Math.min(minr,arr[i]);
            }
            int maxl = 0;
            for(int i=1;i<n;i+=2){
                maxl = Math.max(maxl,arr[i]);
            }
            if(maxl < minr - 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}