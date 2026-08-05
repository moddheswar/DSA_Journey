import java.util.*;

public class BEvanescent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            int del = 0;
            char ch = str.charAt(0);
            int x = 1;
            int i = 0;
            for(i=1;i< n - 1;i++){
                
                if(str.charAt(i) != ch){
                    x++;
                    ch = str.charAt(i);
                }
                if( str.charAt(i) != str.charAt(i+1) && str.charAt(i) != str.charAt(i-1)){
                    if(str.charAt(i+1)== str.charAt(i - 1)){
                        del = Math.max(del,2);
                    }
                    else{
                        del = Math.max(del,1);
                    }
                }
            }
            if(str.charAt(i) != ch){
                    x++;
            }
            System.out.println(x - del);
        }
        sc.close();
    }
}