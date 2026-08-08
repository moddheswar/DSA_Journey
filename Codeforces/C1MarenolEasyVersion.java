import java.util.*;

public class C1MarenolEasyVersion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str1= sc.next();
            String str2 = sc.next();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                a[i] = str1.charAt(i) - '0';
            }
            for(int i=0;i<n;i++){
                b[i] = str2.charAt(i) - '0';
            }
            int ax1 = 0;
            int ay1 = 0;
            int ax2 = 0;
            int ay2 = 0;
            for(int i=0;i<n;i+=2){
                if(a[i] == 1){
                    ax1++;
                }
                else{
                    ay1++;
                }
                if(i + 1 < n && a[i+1] == 1){
                    ax2++;
                }
                else{
                    ay2++;
                }
            }
            int bx1 = 0;
            int bx2 = 0;
            int by1 = 0;
            int by2 = 0;
            for(int i=0;i<n;i+=2){
                if(b[i] == 1){
                    bx1++;
                }
                else{
                    by1++;
                }
                if(i + 1 < n && b[i+1] == 1){
                    bx2++;
                }
                else{
                    by2++;
                }
            }
            if(ax1 == bx1 && ay1 == by1 && ax2== bx2 && ay2 == by2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        
            
        }
        sc.close();
    }
}