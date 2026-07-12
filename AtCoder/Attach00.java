import java.util.*;

public class Attach00{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextInt();
            long v = 100;
            for(int i=1;i<100;i++){
                long temp = n * i;
                int zero = 0;
                while(temp > 0){
                    long k = temp % 10;
                    if(k == 0){
                        zero ++;
                        if(zero >= 2){
                            v = i;
                            break;
                        }
                    }
                    else{
                        zero = 0;
                    }
                    temp /= 10;
                }
                if(v != 100){
                    break;
                }
            }
            System.out.println(n * v);
        }
        sc.close();
    }
}