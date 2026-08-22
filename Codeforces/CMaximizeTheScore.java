import java.util.*;

public class CMaximizeTheScore{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Map<Integer,Integer> map = new HashMap<>();
            int[] dp = new int[n + 1];
            for(int i=1;i<=n;i++){
                int inp = sc.nextInt();
                if(map.containsKey(inp)){
                    System.out.println(inp+" "+i+" "+map.get(inp));
                    dp[i] = Math.max((i - map.get(inp) + 1) * (i - map.get(inp) + 1), dp[i - 1] + 1);
                }
                else{
                    dp[i] = dp[i-1] + 1;
                    map.put(inp,i);
                }
            }
            System.out.println(dp[n - 1]);
        }
        sc.close();
    }
}