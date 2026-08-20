import java.util.*;

public class ManyBalls{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder str = new StringBuilder();
        while(n>0){
            if(n%2==0){
                n/=2;
                str.append('B');
            }
            else{
                n-=1;
                str.append('A');
            }
        }
        System.out.println(str.reverse());
        
        sc.close();
    }
}