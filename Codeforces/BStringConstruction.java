import java.util.*;

public class BStringConstruction{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int l = n/2;
            int r = (n/2) + (n%2);
            if((l - 1) + ( r - 1) >= k){
                int[] arr = new int[n];
                int st = 0;
                int ed = n - 1;
                arr[st] = 1;
                arr[ed] = 0;
                st++;
                ed--;
                int pairs = 0;
                while(st < ed){
                    arr[st] = 1;
                    st++;
                    pairs++;
                    if(pairs == k) break;
                    arr[ed] = 0;
                    ed--;
                    pairs++;
                }
                while(st<ed){
                    arr[st] = (arr[st - 1] == 0) ? 1 : 0;
                    st++;
                    arr[ed] = (arr[ed + 1] == 0) ? 1 : 0;
                    ed--;
                }
                for(int i=0;i<n;i++){
                    System.out.print(arr[i]);
                }
                System.out.println();

            }
            else{
                System.out.println("-1");
                continue;
            }
        }
        sc.close();
    }
}