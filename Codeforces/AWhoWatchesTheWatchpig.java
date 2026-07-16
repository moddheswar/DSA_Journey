import java.util.*;

public class AWhoWatchesTheWatchpig{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int[] r = new int[n];
            int[] l = new int[n];
            if(k > n/2){
                System.out.println("-1");
                continue;
            }
            int c = 0;
            for(int i=0;i<k;i++){
                if(str.charAt(i) != 'R'){
                    c++;
                }
            }
            for(int i=n-k;i<n;i++){
                if(str.charAt(i) != 'L'){
                    c++;
                }
            }
            System.out.println(c);

        }
        sc.close();
    }
}