import java.util.*;

public class PrePalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int pal = 0;
        for(int i=0;i<n;i++){
            pal ++;
            int r = i + 1;
            int l = i - 1;
            int unmatch = 0;
            while(l >= 0 && r < n){
                if(str.charAt(r) != str.charAt(l)){
                    unmatch++;
                }
                if(unmatch > 1){
                    break;
                }
                pal++;
                l--;
                r++;
            }
        }
        for(int i=0;i<n-1;i++){
            int unmatch = 0;
            if(str.charAt(i) != str.charAt(i+1)){
                unmatch++;
            }
            pal ++;
            int r = i + 2;
            int l = i - 1;
            while(l >= 0 && r < n){
                if(str.charAt(r) != str.charAt(l)){
                    unmatch++;
                }
                if(unmatch > 1){
                    break;
                }
                pal++;
                l--;
                r++;
            }
        }
        System.out.println(pal);
        sc.close();
    }
}