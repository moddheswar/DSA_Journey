import java.util.*;

public class ABigrams{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            int two = 0;
            int c = 0;
            for(int i=0;i<k;i++){
                int temp = sc.nextInt();
                if(temp > 2){
                    c++;
                }
                else if(temp == 2){
                    two++;
                }
            }
            if(c >= 1){
                System.out.println("YES");
            }
            else if(two >=2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}