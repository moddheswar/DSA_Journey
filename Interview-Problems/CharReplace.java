import java.util.*;

public class CharReplace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();
        int k = sc.nextInt();
        int lt = 0;
        int N = str.length();
        int[] cnt = new int[26];
        int ans = 0;
        int maxfreq = 0;
        for(int rt=0;rt<N;rt++){
            char ch=str.charAt(rt);            
            maxfreq=Math.max(maxfreq,++cnt[(ch-'A')]);
            while(rt-lt+1-maxfreq > k){
                cnt[(str.charAt(lt)-'A')]--;
                lt++;
            }
            ans=Math.max(ans,rt-lt+1);
        }
        System.out.println(ans);
        sc.close();
    }
    
}
