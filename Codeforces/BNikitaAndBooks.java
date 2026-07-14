import java.util.*;

public class BNikitaAndBooks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int car = 0;
            boolean flage = true ;
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                int temp = arr[i];
                if(temp == i+1){
                    continue;
                }
                if(temp > i){
                    car += temp - (i + 1);
                }
                else{
                    car -= (i+1) - temp;
                    if(car < 0){
                        flage = false;
                        break;
                    }
                }
            }
            System.out.println(flage ? "YES" : "NO");
        }
        sc.close();
    }
}