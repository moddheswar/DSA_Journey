import java.util.*;

public class AIskanderAndDrawings{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int c = 0;
            int max = 0;
            String str = sc.next();
            for(int i=0;i<n;i++){
                if(str.charAt(i) == '#'){
                    c++;
                }
                else{
                    c=0;
                }
                max = Math.max(c,max);
            }
            System.out.println(max/2 + (max % 2));
        }
        sc.close();
    }
}