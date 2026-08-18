import java.util.*;

public class AThreeNumbersOnTheBlackboard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long min = Math.min(a,Math.min(b,c));
            long max = Math.max(a,Math.max(b,c));
            long oth = a + b + c - min - max;
            if(min + oth < max){
                max = min + oth;
            }
            System.out.println(max - min);
        }
        sc.close();
    }
}