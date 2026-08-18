import java.util.*;

public class Min_Del_To_String_Equal{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String stra = sc.next();
        String strb = sc.next();

        int lena = stra.length();
        int lenb = strb.length();

        int[][] dp = new int[lena + 1][lenb + 1];
        int res = 0;
        for(int ptra=1;ptra<=lena;ptra++){
            for(int ptrb=1;ptrb<=lenb;ptrb++){
                if(stra.charAt(ptra - 1) == strb.charAt(ptrb - 1)){
                    dp[ptra][ptrb] = dp[ptra-1][ptrb-1] + 1;
                    res = Math.max(res,dp[ptra][ptrb]);
                }
                else{
                    dp[ptra][ptrb] = 0;
                }
            }
        }
        System.out.println(lena + lenb - (2 * res));

        sc.close();
    }
}