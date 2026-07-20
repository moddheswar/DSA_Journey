import java.util.*;

public class AZeroSum{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();

            int s = 0;
            for(int i=0;i<n;i++){
                s+=sc.nextInt();
            }
            
            if(n%2 != 0 ){
                System.out.println("NO");
            }
            else if(s%4 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}