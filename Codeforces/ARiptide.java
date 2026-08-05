import java.util.*;

public class ARiptide{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int s = a+b+c;
            int min = Math.min(a,Math.min(b,c));
            int max = Math.max(a,Math.max(b,c));
            int rem = s - min - max;
            System.out.println(Math.min(max - rem,rem - min));
        }
        sc.close();
    }
}