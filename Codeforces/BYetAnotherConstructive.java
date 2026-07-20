import java.util.*;

public class BYetAnotherConstructive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int m = sc.nextInt();

            if(m < k){
                System.out.println("NO");
                continue;
            }
            else{
                System.out.println("YES");
                for(int i=0;i<n-1;i++){
                    System.out.print(1 + " ");
                }
                System.out.println(m - k + 1);
            }
        }
        sc.close();
    }
}