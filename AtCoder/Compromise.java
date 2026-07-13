import java.util.*;

public class Compromise{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flage = false;
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            if(temp >=0){
                flage = true;
            }
        }
        
        System.out.println( flage ? "No" : "Yes");
        sc.close();
    }
}