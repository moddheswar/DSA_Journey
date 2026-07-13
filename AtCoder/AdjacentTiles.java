import java.util.*;

public class AdjacentTiles{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long pair = 0;
            long pow = 4;
            while(n>1){
                pair += (n / 4) * pow;
                long r = n % 4;

                if(r==2) pair += pow/4;
                else if(r == 3) pair += pow/2;
                n /= 4;
                pow *= 2;
            }
            System.out.println(pair);
        }
        sc.close();
    }
}