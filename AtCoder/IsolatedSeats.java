import java.util.*;

public class IsolatedSeats{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char ch = str.charAt(0);
        int c = 0;
        int x = 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == 'x'){
                if(i == 0 || str.charAt(i - 1) == 'x'){
                    if(i == n-1 || str.charAt(i+1) == 'x'){
                        x++;
                    }
                }
            }
        }
        System.out.println(x - c);
        sc.close();
    }
}