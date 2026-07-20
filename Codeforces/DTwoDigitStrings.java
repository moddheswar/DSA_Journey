import java.util.*;

public class DTwoDigitStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String str1 = sc.next();
            String str2 = sc.next();
            int[] ar1 = new int[str1.length()];
            int[] ar2 = new int[str2.length()];
            int s = 0;

            for(int i=0;i<str1.length();i++){
                s += str1.charAt(i) - '0';
                s %= 10;
                ar1[i] = s;
            }
            int temp = s;
            s = 0;
            for(int i=0;i<str2.length();i++){
                s += str2.charAt(i) - '0';
                s %= 10;
                ar2[i] = s;
            }
            if(s != temp){
                System.out.println("-1");
                continue;
            }
            
            int[][] dp = new int[ar1.length+1][ar2.length+1];

            for(int i=1;i<dp.length;i++){
                for(int j=1;j<dp[0].length;j++){
                    if(ar1[i-1] == ar2[j-1]){
                        dp[i][j] = dp[i-1][j-1] +1;
                    }
                    else{
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            System.out.println(dp[dp.length - 1][dp[0].length - 1] > 0 ? dp[dp.length - 1][dp[0].length -1 ] : -1);
        }
        sc.close();
    }
}